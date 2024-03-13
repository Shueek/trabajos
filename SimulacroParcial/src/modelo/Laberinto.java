/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DavidSJ
 */
public class Laberinto {
    private Nodo inicio;

    public Laberinto() {
        Acertijos acertijo1 = new Acertijos("Cuanto es 2 + 2", "4");
        Nodo nodo1 = new Nodo(acertijo1);

       
        inicio = nodo1;
    }

    public Nodo getInicio() {
        return inicio;
    }
}
