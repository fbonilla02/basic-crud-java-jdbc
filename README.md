# basic-crud-java-jdbc


## Para ejecutar dentro del contenedor 

tienes que entrar en el contenedor del docker
```
docker exec -it java-app bash
```

y luego ejecutas para poder hacer cualquera de las acciones
```
javac -cp postgresql-42.7.3.jar:. Main.java DB.java Tarea.java TareaDAO.java
java -cp postgresql-42.7.3.jar:. Main
```
