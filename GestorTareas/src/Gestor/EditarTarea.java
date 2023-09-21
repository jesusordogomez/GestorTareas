package Gestor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

                System.out.println("Ingrese la nueva fecha de la tarea (en formato dd/MM/yyyy):");
                String nuevaFechaStr = scanner.nextLine();

                // Convertir la fecha ingresada a un objeto Date
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    Date nuevaFecha = dateFormat.parse(nuevaFechaStr);
                    tarea.setNombre(nuevoNombre);
                    tarea.setDescripcion(nuevaDescripcion);
                    tarea.setFecha(nuevaFecha);

                    System.out.println("Tarea editada con éxito.");
                    return;
                } catch (ParseException e) {
                    System.out.println("Formato de fecha incorrecto. Utilice dd/MM/yyyy.");
                    return;
                }
            }
        }
        System.out.println("No se encontró ninguna tarea con el nombre '" + nombreTarea + "'.");
    }
}