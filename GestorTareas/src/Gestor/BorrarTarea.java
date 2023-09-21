package Gestor;

import java.util.*;


public class BorrarTarea {
	
	public static void borrarTarea(List<Tarea> listaTareas) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la tarea que desea borrar:");
        String nombreTareaABorrar = scanner.nextLine();

        Tarea tareaABorrar = null;
        for (Tarea tarea : listaTareas) {
            if (tarea.getNombre().equals(nombreTareaABorrar)) {
                tareaABorrar = tarea;
                break; 
            }
        }

        if (tareaABorrar != null) {
            listaTareas.remove(tareaABorrar);
            System.out.println("Tarea borrada con éxito.");
        } else {
            System.out.println("No se encontró ninguna tarea con ese nombre.");
        }
	}
}
