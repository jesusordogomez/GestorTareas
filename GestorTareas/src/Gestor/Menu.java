package Gestor;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        List<Tarea> listaTareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Crear una tarea");
            System.out.println("2. Editar una tarea");
            System.out.println("3. Borrar una tarea");
            System.out.println("4. Listar tareas");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Tarea nuevaTarea = Crear.crearTarea();
                    listaTareas.add(nuevaTarea);
                    System.out.println("Tarea creada con éxito.");
                    break;
                case 2:
                    EditarTarea.editarTarea(listaTareas);
                    break;
                case 3:
                    BorrarTarea.borrarTarea(listaTareas);
                    break;
                case 4:
                    ListarTareas.listarTareas(listaTareas);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 5);
    }
}
