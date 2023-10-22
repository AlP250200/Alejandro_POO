package edu.alex.reto9.Ayudantes.Process;

import java.util.Random;

/**
 * En esta clase contiene toda la logica del progrma mas un metodo que genera los ayudantes contiene un override que
 * se usa para cambiar los parametros de los ayudantes
 */
public class Ayudante {
    String nombre;
    int numeroOjos;
    String colorPiel;
    String altura;
    int nivelCreacion;
    int nivelArreglo;
    int nivelDestructivo;

    /**
     * Este es el costructor que usa como parametro los siguientes
     * @param nombre
     * @param numeroOjos
     * @param colorPiel
     * @param altura
     * @param nivelCreacion
     * @param nivelArreglo
     * @param nivelDestructivo
     */
    public Ayudante(String nombre, int numeroOjos, String colorPiel, String altura, int nivelCreacion, int nivelArreglo, int nivelDestructivo) {
        this.nombre = nombre;
        this.numeroOjos = numeroOjos;
        this.colorPiel = colorPiel;
        this.altura = altura;
        this.nivelCreacion = nivelCreacion;
        this.nivelArreglo = nivelArreglo;
        this.nivelDestructivo = nivelDestructivo;
    }

    /**
     * Este es el uso del override que se usa para sobreescribir y cambiar los atributos del arreglo
     * @return regresa el to String
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Número de ojos: " + numeroOjos + "\n" +
                "Color de piel: " + colorPiel + "\n" +
                "Altura: " + altura + "\n" +
                "Nivel de creación: " + nivelCreacion + "\n" +
                "Nivel de arreglo: " + nivelArreglo + "\n" +
                "Nivel destructivo: " + nivelDestructivo + "\n";
    }

    /**
     * Aqui esta la logica para generar los ayudantes mediante un arreglo usando como:
     * @param cantidad
     * @return devuelve el arreglo ayudantes
     */
    public static Ayudante[] generarAyudantes(int cantidad) {
        String[] nombres = {"Ayudante1", "Ayudante2", "Ayudante3", "Ayudante4", "Ayudante5"};
        String[] coloresPiel = {"amarilla", "morada"};
        String[] alturas = {"mediana", "alta"};
        int[] niveles = {1, 2, 3, 4, 5};

        Ayudante[] ayudantes = new Ayudante[cantidad];
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[i];
            int numeroOjos = random.nextInt(2) + 1; // 1 o 2 ojos
            String colorPiel = coloresPiel[random.nextInt(2)]; // Amarilla o Morada
            String altura = alturas[random.nextInt(2)]; // Mediana o Alta
            int nivelCreacion = niveles[random.nextInt(5)]; // Nivel de 1 a 5
            int nivelArreglo = niveles[random.nextInt(5)]; // Nivel de 1 a 5
            int nivelDestructivo = niveles[random.nextInt(5)]; // Nivel de 1 a 5

            ayudantes[i] = new Ayudante(nombre, numeroOjos, colorPiel, altura, nivelCreacion, nivelArreglo, nivelDestructivo);
        }

        return ayudantes;
    }
}
