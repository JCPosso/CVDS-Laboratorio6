package services;

import javax.servlet.http.HttpServlet;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sampleservlet.model.Service;
import sampleservlet.model.Todo;

@WebServlet(
    urlPatterns = "/getUserInfo"
)

public class TodoServices extends HttpServlet{

    private List<Todo> list = new ArrayList<Todo>();

    @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Writer responseWriter = resp.getWriter();
       try {
           Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
           Todo todo = Service.getTodo(Integer.parseInt(optId.get()));
            list.add(todo);
            responseWriter.write(Service.todosToHTMLTable(list));
            resp.setStatus(HttpServletResponse.SC_OK);
           
        } catch (MalformedURLException e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            responseWriter.write("Error interno en el servidor");
        } catch(NumberFormatException e){
            responseWriter.write("Requerimiento invalido, se esperaba un parametro id (int)");
        } catch(NoSuchElementException e){
            responseWriter.write("Requerimiento invalido");
        } catch(FileNotFoundException e){
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseWriter.write("No existe un item con el identificador dado");
        } finally{
            responseWriter.flush();
        }
        
   }
}
