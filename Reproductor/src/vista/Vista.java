/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelos.Tarea;

/**
 *
 * @author
 */
public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("-------------Simulador De Tareas-----------");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Eliminar tarea actual");
        System.out.println("3. Avanzar tareas");
        System.out.println("4. Retroceder tareas");
        System.out.println("5. Salir");
        System.out.print("Elija una opcion: ");
        return scanner.nextInt();
    }

    public String obtenerTituloTarea() {
        System.out.print("Ingrese el titulo de la Tarea: ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public void mostrarTareaActual(Tarea tarea) {
        if (tarea != null) {
            System.out.println("Tarea actual: " + tarea.getTitulo());
        } else {
            System.out.println("No hay tareas en la lista.");
        }
    }
}
