package Gestor;


import java.util.*;

public class Crear {
    public static Tarea crearTarea() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la tarea:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la descripción de la tarea:");
        String descripcion = scanner.nextLine();
        
        System.out.println("Ingrese el año de la tarea:");
        int year = scanner.nextInt();
        
        System.out.println("Ingrese el mes de la tarea (1-12):");
        int month = scanner.nextInt();
        
        System.out.println("Ingrese el día del mes de la tarea:");
        int day = scanner.nextInt();
        
        System.out.println("Ingrese la hora de la tarea (0-23):");
        int hour = scanner.nextInt();
        
        System.out.println("Ingrese los minutos de la tarea (0-59):");
        int minute = scanner.nextInt();
        
        // Crear un objeto Calendar y configurarlo con la fecha y hora ingresadas
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // Restamos 1 porque Calendar.MONTH comienza en 0 para enero
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        
        Date fecha = calendar.getTime();
        
        return new Tarea(nombre, descripcion, fecha);
    }

    public static void main(String[] args) {
        Tarea nuevaTarea = crearTarea();

        System.out.println("Tarea creada:");
        System.out.println("Nombre: " + nuevaTarea.getNombre());
        System.out.println("Descripción: " + nuevaTarea.getDescripcion());
        System.out.println("Fecha: " + nuevaTarea.getFecha());
    }
}


