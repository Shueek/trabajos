/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author
 */
public class ListaTareas{
    private Nodo actual;

    public void agregarTarea(Tarea tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        if (actual == null) {
            actual = nuevoNodo;
            actual.setSiguiente(actual);
        } else {
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void eliminarTareaActual() {
        if (actual == null) return;

        Nodo temp = actual.getSiguiente();
        if (temp == actual) {
            actual = null;
        } else {
            actual.setSiguiente(temp.getSiguiente());
            temp = null;
        }
    }

    public void avanzar() {
        if (actual != null) {
            actual = actual.getSiguiente();
        }
    }

    public void retroceder() {
        if (actual == null) return;

        Nodo temp = actual;
        while (temp.getSiguiente() != actual) {
            temp = temp.getSiguiente();
        }
        actual = temp;
    }

    public Tarea getTareaActual() {
        if (actual != null) {
            return actual.getTarea();
        }
        return null;
    }
}
