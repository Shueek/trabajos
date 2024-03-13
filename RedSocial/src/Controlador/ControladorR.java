/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Evento;
import Modelo.IdUsuario;
import Modelo.SecuenciaEvento;
import Vista.VistaR;
import java.time.LocalDateTime;

/**
 *
 * @author Shueek
 */
public class ControladorR {

    /**
     *
     * @author Admin
     */
    private Evento evento;
    private IdUsuario persona;
    private SecuenciaEvento lista;
    private VistaR  vista;

    public ControladorR() {
        vista = new VistaR();
        lista = new SecuenciaEvento();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.menuInicial();
            switch (opcion) {
                case 1:
                   
                    int id = vista.obtenerId();
                    persona = new IdUsuario ( id);
                    break;
                case 2:
                    String Publicacion = vista.obtenerPublicacion();
                    String Reaccion = vista.obtenerReaccion();
                    String Comentario = vista.obtenerComentario();
                    int ID = vista.obtenerId();
                    evento = new Evento(Publicacion, Reaccion, Comentario, LocalDateTime.now(), ID);
                    break;
                case 3:
                    if (persona != null) {
                        lista.agregarAlInicio(evento);
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 4:
                    if (persona != null) {
                        lista.agregarAlFinal(evento);
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 5:
                    lista.imprimirLista();
                    break;
                case 6:
                    if (persona != null) {
                        lista.removerListaAlInicio();
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 7:
                    if (persona != null) {
                        lista.removerListaAlFinal();
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 8:
                    int idBuscar = vista.obtenerId();
                    Evento eventoEncontrado = lista.buscarPorId(idBuscar);
                    if (eventoEncontrado != null) {
                        System.out.println("Evento encontrado:");
                        System.out.println("Publicacion: " + eventoEncontrado.getPublico());
                        System.out.println("Reaccion: " + eventoEncontrado.getReaccion());
                        System.out.println("Comentario: " + eventoEncontrado.getComentario());
                        System.out.println("ID del Evento: " + eventoEncontrado.getIdunico());
                        System.out.println("Fecha del Evento: " + eventoEncontrado.getFecha());
                    } else {
                        System.out.println("No se encontro ningun evento con el ID especificado.");
                    }
                    break;
             

                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 9);
    }
}
