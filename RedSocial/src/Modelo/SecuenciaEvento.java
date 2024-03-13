/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Shueek
 */
public class SecuenciaEvento {
    private NodoEvento cabeza;
    private NodoEvento cola;
    
    public SecuenciaEvento() {
        this.cabeza = null;
        this.cola = null;
    }
    public boolean estaVacia(){
        return cabeza == null;
    }

    public void agregarAlFinal(Evento evento) {
    NodoEvento nuevoNodo = new NodoEvento(evento);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;           
        }
    }
    public void agregarAlInicio(Evento evento) {
        NodoEvento nuevoNodo = new NodoEvento(evento);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;           
        }
    }

    public void imprimirLista() {
    if (estaVacia()) {
        System.out.println("La lista está vacía.");
        return;
    }
    NodoEvento temp = cabeza;
    int contador = 1;
    while (temp != null) {
        System.out.println("Evento " + contador + ":");
        System.out.println("Publicacion: " + temp.getDato().getPublico());
        System.out.println("Reaccion: " + temp.getDato().getReaccion());
        System.out.println("Comentario: " + temp.getDato().getComentario());
        System.out.println("ID del Evento: " + temp.getDato().getIdunico());
        System.out.println("Fecha del Evento: " + temp.getDato().getFecha());
        System.out.println("-------------------------");
        temp = temp.getSiguiente();
        contador++;
    }
}
    
    public void removerListaAlInicio() {
        if (!estaVacia()) {
            cabeza = cabeza.getSiguiente();
            if (cabeza != null) {
                cabeza.setAnterior(null);
            } else {
                cola = null;
            }
        }
    }
    
    public void removerListaAlFinal() {
        if (!estaVacia()) {
            cola = cola.getAnterior();
            if (cola != null) {
                cola.setSiguiente(null);
            } else {
                cabeza = null;
            }
        }
    }
    
    public Evento buscarPorId(int id) {
        NodoEvento temp = cabeza;
        while (temp != null) {
            if (temp.getDato().getIdunico() == id) {
                return temp.getDato();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }
}
