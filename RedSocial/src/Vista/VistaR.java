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
public class VistaR {
      private Scanner Leer;

    public VistaR() {
        this.Leer = new Scanner(System.in);
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerNombre() {
        System.out.print("Ingrese su nombre: ");
        return Leer.nextLine().trim();
    }
    public int obtenerId() {
        System.out.print("Ingrese su id: ");
        return Leer.nextInt();
    }
    public String obtenerPublicacion() {
        System.out.print("Ingrese su publicacion: ");
        return Leer.nextLine().trim();
    }
    public String obtenerComentario() {
        System.out.print("Ingrese su Comentario: ");
        return Leer.nextLine().trim();
    }
    public String obtenerReaccion() {
        System.out.print("Ingrese su Reaccion: ");
        return Leer.nextLine().trim();
    }

    public int menuInicial() {
        System.out.println("------------------Agregar----------------");
        System.out.println("");
        System.out.println("");
        System.out.println("1. Ingresar su nombre y ID");
        System.out.println("2. Agregar comentario al inicio");
        System.out.println("3. Agregar  comentario al final");
        System.out.println("4. Ver ");
        System.out.println("5. Eliminar comentario  al inicio");
        System.out.println("6. Eliminar comentario al final");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = Leer.nextInt();
        Leer.nextLine();
        return opcion;
    }
    
    public String obtenerRespuesta() {
        System.out.print("Escriba su lista: ");
        return Leer.nextLine().trim();
    }
}
