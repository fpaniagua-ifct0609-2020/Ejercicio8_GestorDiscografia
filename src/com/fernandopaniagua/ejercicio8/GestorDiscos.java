package com.fernandopaniagua.ejercicio8;

import java.util.ArrayList;

public class GestorDiscos {
    public static Disco getDisco() {
        Disco theMiracle = new Disco(
                "The Miracle",
                "Queen",
                "https://www.udiscovermusic.com/wp-content/uploads/2019/11/the-miracle.jpg",
                15.99f);
        
        Cancion tema1 = new Cancion(1, "Party", 2.27f);
        Cancion tema2 = new Cancion(2, "Paquito el chocolatero", 3.18f);
        Cancion tema3 = new Cancion(3, "Bomba", 3.2f);
        
        ArrayList<Cancion> canciones = new ArrayList();
        canciones.add(tema1);
        canciones.add(tema2);
        canciones.add(tema3);
        
        theMiracle.setCanciones(canciones);//Asignamos el array de canciones al disco
        
        return theMiracle;
    }
}
