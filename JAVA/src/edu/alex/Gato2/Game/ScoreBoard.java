package edu.alex.Gato2.Game;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

/**
 * La clase ScoreBoard administra y almacena las puntuaciones de los jugadores.
 * Permite actualizar las puntuaciones, obtener los jugadores clasificados y guardar/cargar puntuaciones desde un archivo.
 */
public class ScoreBoard {
    private static final String SCORES_FILE = "scores.txt";
    private Map<String, Player> playerMap;

    /**
     * Constructor de la clase ScoreBoard.
     * Inicializa el mapa de jugadores y carga las puntuaciones desde el archivo.
     */
    public ScoreBoard() {
        playerMap = new HashMap<>();
        loadScoresFromFile();
    }

    /**
     * Actualiza la puntuación de un jugador en el mapa de puntuaciones.
     * @param player El jugador cuya puntuación se va a actualizar
     */
    public void updateScore(Player player) {
        String playerName = player.getName();
        if (playerMap.containsKey(playerName)) {
            Player existingPlayer = playerMap.get(playerName);
            existingPlayer.setScore(existingPlayer.getScore() + player.getScore());
        } else {
            playerMap.put(playerName, player);
        }
    }
    /**
     * Obtiene una lista de jugadores clasificados por puntuación en orden descendente.
     * @return La lista de jugadores clasificados
     */

    public List<Player> getRankedPlayers() {
        List<Player> rankedPlayers = new ArrayList<>(playerMap.values());
        rankedPlayers.sort(Comparator.comparingInt(Player::getScore).reversed());
        return rankedPlayers;
    }
    /**
     * Guarda las puntuaciones de los jugadores en un archivo de texto.
     */
    public void saveScoresToFile() {
        Path path = Paths.get(SCORES_FILE);

        try (PrintWriter writer = new PrintWriter(new FileWriter(SCORES_FILE))) {
            List<Player> rankedPlayers = getRankedPlayers();
            int rank = 1;
            for (Player player : rankedPlayers) {
                if (!player.getName().equals("Computer")) {
                    writer.println(rank + ": " + player.getName() + ": " + player.getScore() + " puntos");
                    rank++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Carga las puntuaciones de los jugadores desde un archivo de texto.
     */


    private void loadScoresFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SCORES_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length == 3) {
                    String playerName = parts[1];
                    int score = Integer.parseInt(parts[2].split(" ")[0]);
                    Player player = new Player(playerName, '-');
                    player.setScore(score);
                    playerMap.put(playerName, player);
                }
            }
        } catch (IOException | NumberFormatException e) {

            e.printStackTrace();
        }
    }
    /**
     * Muestra los rankings de los jugadores por consola.
     */
    public void displayRankings() {
        List<Player> rankedPlayers = getRankedPlayers();
        System.out.println("Rankings:");
        for (int i = 0; i < rankedPlayers.size(); i++) {
            Player player = rankedPlayers.get(i);
            if (!player.getName().equals("Computer")) {
                System.out.println((i + 1) + ": " + player.getName() + ": " + player.getScore() + " puntos");
            }
        }
    }

}