/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciom;

/**
 *
 * @author Shueek
 */
public class ListaNodo {

    private Nodo cabeza;

    public ListaNodo() {
        this.cabeza = null;
    }

    public void agregarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo rem = cabeza;
            while (rem.getSiguiente() != null) {
                rem = rem.getSiguiente();
            }
            rem.setSiguiente(nuevoNodo);
        }
    }

    public void imprimirLista() {
        Nodo rem = cabeza;
        while (rem != null) {
            System.out.print(rem.getDato() + " ");
            rem = rem.getSiguiente();
        }
        System.out.println();
    }

    public void removerDuplicados() {
        Nodo actual = cabeza;
        while (actual != null && actual.getSiguiente() != null) {
            if (actual.getDato() == actual.getSiguiente().getDato()) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
            } else {
                actual = actual.getSiguiente();
            }
        }
    }
}
