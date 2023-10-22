package edu.alex.reto9.Ayudantes.Process;

/**
 * En esta clase se manda a llamar la clase Ayudante pora mandar a llamar a los ayudantes y generar
 * un bucle for para impirimr los 5 ayudantes
 */
public class CallAyudante {
    public static void callAyudante (){
        Ayudante[] ayudantes = Ayudante.generarAyudantes(5);

        // Imprimir la lista de ayudantes con sus características
        for (Ayudante ayudante : ayudantes) {
            System.out.println(ayudante);
        }
    }
}
