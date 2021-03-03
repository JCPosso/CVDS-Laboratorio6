# Ciclos de vida y desarrollo de Software

### Parte II - HACIENDO UNA APLICACION WEB DINAMICA DE BAJO NIVEL

### Creamos el proyecto maven
![Creation image](img/creation.PNG)

#### El puerto TCP/IP para el servidor Tomcat esta configurado en el puerto :8080

### Compilamos y ejectuamos la aplicacion en el servidor Tomcat usando el siguiente comando

```
mvn package 
mvn tomcat7:run
```

En caso de obtener algun error con el inicio del servidor " No plugin found for prefix 'tocmat7' in the current project and in the plugin groups [org.apache.maven.plugins, org.codehaus.mojo] available from the repositories"
usar el siguiente comando:
```
mvn clean install tomcat7:run
```
Debemos obtener el siguiente mensaje:
![](img/server.PNG)

Una vez nuestro servidor este funcionando, nos iremos a nuestro navegador de 
preferencia y entraremos en la direccion ip: localhost:8080
![](img/helloWorld.PNG)

Y si entramos en nuestra direccion sobre la cual haremos las peticiones "/helloServlet"
veremos el saludo desde nuestra peticion
![hello servlet](img/helloServlet.PNG)

Ahora jugaremos con los parametros de nuestro GET para ello agregaremos a nuestra
url el valor "/helloServlet?name= Johann y Juan" y obtenremos el sigueinte resultado
![hello double](img/greetingDouble.PNG)

### Creando un nuevo servicio 

Una vez creemos nuestro nuevo servicio de tipo GET realizamos las pruebas correspondientes

- El servidor responde de manera correcta y devuelve contenido

![](img/serviceOK.PNG)

- No se indican parametros

![](img/noParams.PNG)

- El parametro no es un entero

![](img/formatError.PNG)

- Ell valor ingresado no existe

![](img/errorFound.PNG)

### PARTE III
 Primero , creamos el archivo Html y luego  desplegamos el servidor para ver como se ve:

 ![](img/formulario.PNG)
 
 - Probamos  el Post

 ![](img/post.PNG)
 
- Probamos que el GET funcione correctamente

![](img/get.PNG)

#### ¿Que diferencia hay entre el metodo GET y POST?
Si utilizamos el metodo GET el input debe llamarse igual  que el parametro que estamos recibiendo
Mientras que el POST  no recibe parametros ni tampoco devuelve nada al formulario.  

#### ¿Que esta viendo en la clase Service?
Cuando utilizamos el metodo GET , la clase service.java nos permite hacer un llamado a una URL en la cual nos retorna una Lista de las cosas por hacer en formato json y el mismo metodo se encarga de convertir los datos  a un Objeto; en este caso se llamado TodoServices, y esta misma clase se encarga de renderizar los elementos en un ambiente HTML utilizando tablas.

### PARTE IV -Pruebas
### A
Primero intentamos adivinar el numero y proporciona los siguientes resultados:
#### Perder Intento
![](/img/perderintento.PNG)
#### Ganar Juego
![](/img/Win.PNG)
#### Perder Juego
![](/img/lose.PNG)

### B
Al realizar los intentos y verificar el cambio de puntajes en ambos computadores. Nos dimos cuenta que son valores independientes.
![](/img/label.PNG)
