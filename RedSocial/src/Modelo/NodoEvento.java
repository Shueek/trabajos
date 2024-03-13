/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Shueek
 */
public class NodoEvento {

    private Evento dato;
    private NodoEvento siguiente;
    private NodoEvento anterior;

    public NodoEvento(Evento dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public Evento getDato() {
        return dato;
    }

    public void setDato(Evento dato) {
        this.dato = dato;
    }

    public NodoEvento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEvento siguiente) {
        this.siguiente = siguiente;
    }

    public NodoEvento getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEvento anterior) {
        this.anterior = anterior;
    }
}


