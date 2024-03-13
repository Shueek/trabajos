/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Shueek
 */

public class MNodo {    
    private String dato;
    private MNodo siguiente;

    public MNodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public MNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(MNodo siguiente) {
        this.siguiente = siguiente;
    }
}
