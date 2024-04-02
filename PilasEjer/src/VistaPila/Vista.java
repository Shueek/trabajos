/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistaPila;

/**
 *
 * @author Shueek
 */
public class Vista {
    public void mostrarResultado(boolean balanceado) {
        if (balanceado) {
            System.out.println("Los parentesis estan  balanceados.");
        } else {
            System.out.println("Los parentesis no estan  balanceados.");
        }
    }
}
