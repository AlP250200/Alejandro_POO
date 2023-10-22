package edu.alex.reto9.Pelota.Process;

/**
 * En esta clase solamente llama  las acciones de la clase pelota
 */
public class SimulacionPelota {


    public static void simularPelota(Pelota pelota) {

        // Mostrar los atributos iniciales de la pelota
        System.out.println("Color de la pelota: " + pelota.getColor());
        System.out.println("Rapidez de la pelota: " + pelota.getRapidez());
        System.out.println("Poder de la pelota: " + pelota.getPoder());

        // Realizar acciones en la pelota
        pelota.disminuirRapidez();
        pelota.aumentarPoder();

        // Mostrar los atributos actualizados de la pelota
        System.out.println("Después de las acciones:");
        System.out.println("Rapidez de la pelota: " + pelota.getRapidez());
        System.out.println("Poder de la pelota: " + pelota.getPoder());
    }

}
