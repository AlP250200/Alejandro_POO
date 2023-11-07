package edu.alex.RetoFinal.Game;

public class GatoIAFactory implements GatoFactory{
    @Override
    public Gato crearJuego(String idioma, int tamañoTablero) {
        return new GatoIA(idioma, tamañoTablero);
    }
}
