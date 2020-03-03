package com.fernandopaniagua.ejercicio8;

public class Creador {
    public static void main(String[] args) {
        Disco disco1 = GestorDiscos.getDisco();
        HTMLGenerator.generarHTML(disco1, "F:/_fpaniagua/");
        
        System.out.println("GAME OVER");//Verónica: color coral
    }
}
