package edu.alex.RetoFinal.Game;

public class GatoIAFactory implements GatoFactory{
    @Override
    public Gato crearJuego( int tamañoTablero) {
        return new GatoIA(tamañoTablero);
    }
}
