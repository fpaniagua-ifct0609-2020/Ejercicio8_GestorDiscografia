package com.fernandopaniagua.ejercicio8;

import java.text.Normalizer;
import java.util.ArrayList;

public class Disco {
    private String titulo;
    private String artista;
    private String caratula;
    private float precio;
    private ArrayList<Cancion> canciones = new ArrayList();

    public Disco(String titulo, String artista, String caratula, float precio) {
        this.titulo = titulo;
        this.artista = artista;
        this.caratula = caratula;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
}
