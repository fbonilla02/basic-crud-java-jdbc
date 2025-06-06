
public class Tarea {
  public int id;
  public String titulo;

  public Tarea(int id, String titulo){
    this.id = id;
    this.titulo = titulo;
  }

@Override
public String toString() {
  return id + ": " + titulo;
}

}



