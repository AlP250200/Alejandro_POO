package edu.alex.reto9.Pelota;

import edu.alex.reto9.Pelota.Process.Pelota;
import edu.alex.reto9.Pelota.Process.SimulacionPelota;

/**
 *Es la clase MAIN donde se manda a llamar la clase SimulacionPelota para la ejecución del programa
 * a partir del diagrama de clases dado en el Reto 9
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Simulación de la Pelota 1:");
        SimulacionPelota.simularPelota(new Pelota("Roja", 10, 5));
    }
}
