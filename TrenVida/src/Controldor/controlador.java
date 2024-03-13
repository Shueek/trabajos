/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controldor;

import Modelo.Recuerdo;
import Vista.ListaNodo;

/**
 *
 * @author Shueek
 */
public class controlador {
 
    private Recuerdo lista;
    private ListaNodo vista;

    public controlador() {
        vista = new ListaNodo();
        lista = new Recuerdo();
    }

    public void iniciarJuego() {
        int opcion;
        do {
            opcion = vista.MenuInicio();
            switch (opcion) {
              
                case 1:
                    
                        lista.agregarAlFinal(vista.VerRespuesta());
                    
                    break;
                case 2:
                    lista.imprimirLista();
                    break;
                
                case 3:
                    vista.mostrarMensaje("sigue vijando");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 3);
    }
}


