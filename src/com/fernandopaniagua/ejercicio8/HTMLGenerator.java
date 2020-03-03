package com.fernandopaniagua.ejercicio8;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class HTMLGenerator {

    public static void generarHTML(Disco disco, String ruta) {
        try {
            String nombreFichero = disco.getTitulo() + ".html";
            nombreFichero = ruta + nombreFichero.replace(' ', '_');
            //Apertura fichero
            PrintWriter pw = new PrintWriter(new File(nombreFichero));
            //Contenido del fichero
            pw.println("<html><head></head><body>");

            pw.println("<h1>" + disco.getTitulo() + "</h1>");
            pw.println("<h2>" + disco.getArtista() + "</h2>");
            pw.println("<h3>" + disco.getPrecio() + "€" + "</h3>");
            pw.println("<img src='" + disco.getCaratula() + "' width='300px'>");
            pw.println("<div>");
            
            //Alternativa 1 - MÁS CUTRE
            /*
            for(int i=0;i<disco.getCanciones().size();i++){
                pw.println("<p>" + disco.getCanciones().get(i).getOrdinal() 
                        + "-" 
                        + disco.getCanciones().get(i).getTitulo() 
                        + "</p>");
            }
             */
            
            //Alternativa 2 - MENOS CUTRE - No le gusta a Alberto
            /*
            ArrayList<Cancion> canciones = disco.getCanciones();
            for(int i=0;i<canciones.size();i++){
                pw.println("<p>" + canciones.get(i).getOrdinal() 
                        + "-" 
                        + canciones.get(i).getTitulo() 
                        + "</p>");
            }
             */
            
            //Alternativa 3 - Alternativa COOL
            for (Cancion c : disco.getCanciones()) {
                pw.println("<p>"
                        + c.getOrdinal()
                        + "-"
                        + c.getTitulo()
                        + " Duración:"
                        + c.getDuracion()
                        + "</p>");
            }
            //Fin de alternativa 3

            pw.println("</div>");
            pw.println("</body></html>");
            //Cierre de fichero
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
