package edu.alex.reto9.Pelota.Process;

/**
 * En esta clase esta la clase pelota que contiene toda la logica del progrmana
 * sus atributos , el constructor y los metodos de esto clase
 */
public class Pelota {
    /**
     *  Los atributos de la clase Pelota
     */
    private String color;
    private int rapidez;
    private int poder;

    /**
     * El constructor de la clase Pelota
     */
    public Pelota(String color, int rapidez, int poder) {
        this.color = color;
        this.rapidez = rapidez;
        this.poder = poder;
    }

    /**
     * Los metodos de la clase pelota proporcionados por el diagrama de clase
     */
    public void disminuirRapidez() {
        if (rapidez > 0) {
            rapidez--;
        }
    }

    public void aumentarPoder() {
        poder++;
    }

    /** Getter y Setter para el color
     *
     * @return regresa el atributo color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /** Getter y Setter para la rapidez
     *
     * @return regresa el atributo rapidez
     */
    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }

    /** Getter y Setter para el poder
     *
     * @return regresa el atributo poder
     */
    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
