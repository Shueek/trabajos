/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilasejer;

import Controlador.ControladorPila;
import VistaPila.Vista;
import java.util.Scanner;

/**
 *
 * @author Shueek
 */
public class PilasEjer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorPila cont = new ControladorPila();
        Vista vist = new Vista();
        Scanner scanner = new Scanner(System.in);

        String cadena1 = "()())";
        String cadena2 = "()()()";

        boolean balanceado = cont.verificarBalance(cadena1);
        boolean balanceado2 = cont.verificarBalance(cadena2);

        vist.mostrarResultado(balanceado);
        vist.mostrarResultado(balanceado2);
    }

}
