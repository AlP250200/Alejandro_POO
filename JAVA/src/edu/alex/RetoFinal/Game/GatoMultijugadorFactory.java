package edu.alex.RetoFinal.Game;

public class GatoMultijugadorFactory implements GatoFactory{
    @Override
    public Gato crearJuego( int tamañoTablero) {
        return new GatoMultijugador( tamañoTablero);
    }
}
