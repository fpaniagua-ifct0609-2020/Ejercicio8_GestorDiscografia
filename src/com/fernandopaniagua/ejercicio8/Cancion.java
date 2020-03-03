package com.fernandopaniagua.ejercicio8;

public class Cancion {
    private int ordinal;
    private String titulo;
    private float duracion;

    public Cancion(int ordinal, String titulo, float duracion) {
        this.ordinal = ordinal;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
   
}
