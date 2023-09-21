package Gestor;

import java.util.List;

public class ListarTarea {
    public static void listarTareas(List<Tarea> listaTareas) {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas para mostrar.");
        } else {
            System.out.println("Lista de tareas:");
            for (Tarea tarea : listaTareas) {
                System.out.println("Nombre: " + tarea.getNombre());
                System.out.println("Descripción: " + tarea.getDescripcion());
                System.out.println("Fecha: " + tarea.getFecha());
                System.out.println();
            }
        }
    }
}
