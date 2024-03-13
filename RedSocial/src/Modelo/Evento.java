/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Shueek
 */
public class Evento {
       private String publico;
    private String Comentario;
    private String Reaccion;
    private LocalDateTime Fecha;
    private int Idunico;

    public Evento(String publico, String Comentario, String Reaccion, LocalDateTime Fecha, int Idunico) {
        this.publico = publico;
        this.Comentario = Comentario;
        this.Reaccion = Reaccion;
        this.Fecha = Fecha;
        this.Idunico = Idunico;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public String getReaccion() {
        return Reaccion;
    }

    public void setReaccion(String Reaccion) {
        this.Reaccion = Reaccion;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime Fecha) {
        this.Fecha = Fecha;
    }

    public int getIdunico() {
        return Idunico;
    }

    public void setIdunico(int Idunico) {
        this.Idunico = Idunico;
    }

}

