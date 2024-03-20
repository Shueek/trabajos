/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelos.Tarea;
import modelos.ListaTareas;
import vista.Vista;
/**
 *
 * @author
 */
public class Controlador {
    private ListaTareas listaReproduccion;
    private Vista vista;

    public Controlador() {
        listaReproduccion = new ListaTareas();
        vista = new Vista();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    String titulo = vista.obtenerTituloTarea();
                    listaReproduccion.agregarTarea(new Tarea(titulo));
                    break;
                case 2:
                    listaReproduccion.eliminarTareaActual();
                    break;
                case 3:
                    listaReproduccion.avanzar();
                    break;
                case 4:
                    listaReproduccion.retroceder();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

            Tarea TareaActual = listaReproduccion.getTareaActual();
            vista.mostrarTareaActual(TareaActual);
        } while (opcion != 5);
    }
}

