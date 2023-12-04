package edu.alex.Gato2.Game;
/**
 * La clase Player representa un jugador en el juego Tic-Tac-Toe.
 * Contiene información como el nombre del jugador, el símbolo que utiliza en el juego y su puntuación.
 */
public class Player {  private String name;
    private char symbol;
    private int score;
    /**
     * Constructor de la clase Player.
     * @param name   El nombre del jugador
     * @param symbol El símbolo del jugador ('X' o 'O')
     */
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
        this.score = 0;
    }
    /**
     * Obtiene el nombre del jugador.
     * @return El nombre del jugador
     */
    public String getName() {
        return name;
    }
    /**
     * Obtiene el símbolo del jugador en el juego.
     * @return El símbolo del jugador ('X' o 'O')
     */
    public char getSymbol() {
        return symbol;
    }
    /**
     * Obtiene la puntuación actual del jugador.
     * @return La puntuación del jugador
     */
    public int getScore() {
        return score;
    }
    /**
     * Incrementa la puntuación del jugador por una cantidad determinada de puntos.
     * @param points Los puntos que se sumarán a la puntuación del jugador
     */
    public void incrementScore(int points) {
        this.score+= points;

    }
    /**
     * Establece la puntuación del jugador a un valor específico.
     * @param score El valor al que se establecerá la puntuación del jugador
     */
    public void setScore(int score) {
        this.score = score;
    }

}
