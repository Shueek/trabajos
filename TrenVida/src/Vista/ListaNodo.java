/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author Shueek
 */
public class ListaNodo {

    private Scanner Leer;

    public ListaNodo() {
        this.Leer = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }



    public int MenuInicio() {
        System.out.println("------TREN ------");
        System.out.print("");
        System.out.println("1. Comenzar viaje ");
        System.out.println("2. Ver Lugares");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = Leer.nextInt();
        Leer.nextLine();
        return opcion;
    }
      
    public String VerRespuesta() {
        System.out.print("Escribe tu lugar: ");
        return Leer.nextLine().trim();
    }
}

