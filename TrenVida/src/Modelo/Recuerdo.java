/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Shueek
 */
public class Recuerdo {

    private MNodo cabeza;

    public Recuerdo() {
        this.cabeza = null;
    }

    public void agregarAlFinal(String dato) {
        MNodo nuevoNodo = new MNodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            MNodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    public void imprimirLista() {
        MNodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.getDato() + " ");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }

}
