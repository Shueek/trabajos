/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Nodo;

/**
 *
 * @author Shueek
 */
public class ListaEnlazada {

    private Nodo cabeza;
    private Nodo Cola;

    public ListaEnlazada() {
        this.cabeza = null;
        this.Cola = null;
    }

    public boolean estaVacio() {
        return cabeza == null;
    }

    public void agregarInicio(String Dato) {
        Nodo nuevoNodo = new Nodo(Dato);
        if (estaVacio()) {
            cabeza = nuevoNodo;
            Cola = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(Cola);
            Cola.setAnterior(nuevoNodo);
            Cola = nuevoNodo;

        }

    }
    public void agregarFinal(String Dato) {
        Nodo nuevoNodo = new Nodo(Dato);
        if (estaVacio()) {
            cabeza = nuevoNodo;
            Cola = nuevoNodo;
        } else {
            Cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(Cola);
            Cola = nuevoNodo;

        }

    }

    public void imprimirLista() {
        if (estaVacio()) {
            System.out.println("La lista esta vacia.");
        }
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.getDato() + " ");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }
    
    public void removerListaInicio() {
        if (!estaVacio()) {
            cabeza = cabeza.getSiguiente();
            if (cabeza != null) {
                cabeza.setAnterior(null);
            } else {
                Cola = null;
            }
        }
    }
    public void removerListaFinal() {
        if (!estaVacio()) {
            Cola = Cola.getAnterior();
            if (Cola != null) {
                Cola.setSiguiente(null);
            } else {
                cabeza = null;
            }
        }
    }
}
