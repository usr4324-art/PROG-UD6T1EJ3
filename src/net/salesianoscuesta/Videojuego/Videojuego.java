package net.salesianoscuesta.Videojuego;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Videojuego {
    private String titulo;
    private String genero;
    private int horasJugadas;

    public Videojuego(String titulo, String genero, int horasJugadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %d horas", titulo, genero, horasJugadas);
    }
}