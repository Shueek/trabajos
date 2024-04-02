/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Shueek
 */
public class PilaLista {
    NodoPila top;
    int size;
    
    public PilaLista (){
    top = null;
    size = 0;
    
    }
    public boolean estaVacia(){
    return top == null;
    }
    public int obtenerTamaño(){
    return size;
    }
    public void push (int dato) {
   NodoPila nuevoNodo = new  NodoPila (dato);
   if (top ==  null) {
   top = nuevoNodo;
  
   }else {
   nuevoNodo.Siguiente = top;
   top = nuevoNodo;
   }
   
   size++;
    }
    public int pop()throws Exception{
        if (estaVacia())  {
            throw new Exception(" esta vacio");
        }
        int dato = top.dato;
        top = top.Siguiente;
        size--;
        return dato;
    }
    public int peek()throws Exception{
        if (estaVacia ()){
           throw new Exception("esta vacio");
        }
        return top.dato;
        }
}
