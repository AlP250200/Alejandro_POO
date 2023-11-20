package edu.alex.Gato2.Game;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ScoreBoard {
    private static final String SCORES_FILE = "scores.txt";
    private Map<String, Player> playerMap;

    public ScoreBoard() {
        playerMap = new HashMap<>();
        loadScoresFromFile();  // Cargar puntuaciones al iniciar
    }

    public void updateScore(Player player) {
        String playerName = player.getName();
        if (playerMap.containsKey(playerName)) {
            Player existingPlayer = playerMap.get(playerName);
            existingPlayer.setScore(existingPlayer.getScore() + player.getScore()); // Acumular el puntaje
        } else {
            playerMap.put(playerName, player); // Agregar nuevo jugador al mapa
        }
    }

    public List<Player> getRankedPlayers() {
        List<Player> rankedPlayers = new ArrayList<>(playerMap.values());
        rankedPlayers.sort(Comparator.comparingInt(Player::getScore).reversed());
        return rankedPlayers;
    }

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

    private void loadScoresFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SCORES_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length == 3) {
                    String playerName = parts[1];
                    int score = Integer.parseInt(parts[2].split(" ")[0]); // Obtener puntaje como entero
                    Player player = new Player(playerName, '-');  // Se usa '-' como marcador temporal
                    player.setScore(score);
                    playerMap.put(playerName, player); // Agregar jugador al mapa
                }
            }
        } catch (IOException | NumberFormatException e) {
            // Manejar excepciones según sea necesario
            e.printStackTrace();
        }
    }

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