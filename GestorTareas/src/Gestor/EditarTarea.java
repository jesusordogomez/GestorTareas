package Gestor;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EditarTarea {
    public static void editarTarea(List<Tarea> listaTareas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la tarea que desea editar:");
        String nombreTarea = scanner.nextLine();

        for (Tarea tarea : listaTareas) {
            if (tarea.getNombre().equals(nombreTarea)) {
                System.out.println("Ingrese el nuevo nombre de la tarea:");
                String nuevoNombre = scanner.nextLine();

                System.out.println("Ingrese la nueva descripción de la tarea:");
                String nuevaDescripcion = scanner.nextLine();

                System.out.println("Ingrese la nueva fecha de la tarea (en milisegundos desde Epoch):");
                long nuevaFechaMillis = scanner.nextLong();
               
                tarea.setNombre(nuevoNombre);
                tarea.setDescripcion(nuevaDescripcion);
                tarea.setFecha(new Date(nuevaFechaMillis));

                System.out.println("Tarea editada con éxito.");
                return;
            }
        }
        System.out.println("No se encontró ninguna tarea con el nombre '" + nombreTarea + "'.");
    }
}