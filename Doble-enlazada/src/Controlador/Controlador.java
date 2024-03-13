/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.ListaEnlazada;
import VistaD.VistaE;

/**
 *
 * @author Shueek
 */
public class Controlador {
      private Estudiante estudiante;
    private ListaEnlazada lista;
    private VistaE vista;

    public Controlador() {
        vista = new VistaE();
        lista = new ListaEnlazada(); 
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.menuInicial();
            switch (opcion) {
                case 1:
                    String nombre = vista.obtenerNombre();
                    int edad = vista.obtenerEdad();
                    estudiante = new Estudiante(nombre, edad);
                    break;
                case 2:
                    if (estudiante != null) {
                        lista.agregarInicio(vista.obtenerRespuesta());
                    } else {
                        vista.mostrarMensaje("porfavor sus datos.");
                    }
                    break;
                case 3:
                    if (estudiante != null) {
                        lista.agregarFinal(vista.obtenerRespuesta());
                    } else {
                        vista.mostrarMensaje("porfavor sus datos.");
                    }
                    break;
                case 4:
                    lista.imprimirLista();
                    break;
                case 5:
                    if (estudiante != null) {
                    lista.removerListaInicio();
                    } else {
                        vista.mostrarMensaje("porfavor sus datos.");
                    }
                    break;
                case 6:
                    if (estudiante != null) {
                    lista.removerListaFinal();
                    } else {
                        vista.mostrarMensaje("porfavor sus datos.");
                    }
                    break;
                case 7:
                    vista.mostrarMensaje("Bien hecho " + estudiante.getNombre() + "!");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 7);
    }
}
