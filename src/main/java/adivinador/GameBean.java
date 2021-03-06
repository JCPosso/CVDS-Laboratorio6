package adivinador;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "guessBean")
@SessionScoped
public class GameBean implements Serializable{
    
    private int num;
    private int intentos;
    private int acum;
    private int inte;
    private String estado;
    private ArrayList<Integer> listIntentos;

    public GameBean() {
        listIntentos=new ArrayList<Integer>();
        restart();
    }
    public void guess(int inte){
        this.inte= inte;
        if(inte == this.num){
            estado="Gano "+acum;
        }else{
            acum-=10000;
            intentos+=1;
            listIntentos.add(inte);
        }
        
    }
    public void restart(){
        num = (int)(Math.random()*10+1);
        intentos=0;
        acum=100000;
        listIntentos.clear();
        estado="Jugando..";
    }
    
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getAcum() {
        return acum;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Integer> getListIntentos() {
        return listIntentos;
    }

    public void setListIntentos(ArrayList<Integer> listIntentos) {
        this.listIntentos = listIntentos;
    } 
}