import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TareaDAO dao = new TareaDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Listar tareas\n2. Insertar tarea\n3. Actualizar tarea\n4. Eliminar tarea\n5. Salir");
            System.out.print("Elige una opción: ");
            int op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    dao.listar().forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Título: ");
                    dao.insertar(sc.nextLine());
                    break;
                case 3:
                    System.out.print("ID de tarea: ");
                    int idActualizar = Integer.parseInt(sc.nextLine());
                    System.out.print("Nuevo título: ");
                    dao.actualizar(idActualizar, sc.nextLine());
                    break;
                case 4:
                    System.out.print("ID a eliminar: ");
                    dao.eliminar(Integer.parseInt(sc.nextLine()));
                    break;
                case 5:
                    return;
            }
        }
    }
}

