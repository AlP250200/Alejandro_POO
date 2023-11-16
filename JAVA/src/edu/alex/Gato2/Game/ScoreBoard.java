package edu.alex.Gato2.Game;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScoreBoard {
    private static final String SCORES_FILE = "scores.txt";
    private List<Player> players;

    public ScoreBoard() {
        players = new ArrayList<>();
        loadScoresFromFile();  // Cargar puntuaciones al iniciar
    }

    public void updateScore(Player player) {
        if (!players.contains(player)) {
            players.add(player);
        }
    }

    public List<Player> getRankedPlayers() {
        players.sort(Comparator.comparingInt(Player::getScore).reversed());
        return players;
    }

    public void saveScoresToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SCORES_FILE))) {
            List<Player> rankedPlayers = getRankedPlayers();
            int rank = 1;
            for (Player player : rankedPlayers) {
                if (!player.getName().equals("Computer")) {
                    writer.println(rank + ": " + player.getName() + ": " + player.getScore());
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
                if (parts.length == 2) {
                    String playerName = parts[0];
                    int score = Integer.parseInt(parts[1]);
                    Player player = new Player(playerName, '-');  // Se usa '-' como marcador temporal
                    player.setScore(score);
                    players.add(player);
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
                System.out.println((i + 1) + ": " + player.getName());
            }
        }
    }
}