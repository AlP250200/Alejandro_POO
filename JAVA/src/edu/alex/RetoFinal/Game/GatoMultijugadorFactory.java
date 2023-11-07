package edu.alex.RetoFinal.Game;

public class GatoMultijugadorFactory implements GatoFactory{
    @Override
    public Gato crearJuego(String idioma, int tamañoTablero) {
        return new GatoMultijugador(idioma, tamañoTablero);
    }
}
