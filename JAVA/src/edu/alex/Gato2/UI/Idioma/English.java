package edu.alex.Gato2.UI.Idioma;

public class English implements Language {
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "Welcome to Tic-Tac-Toe!";
            case "game_mode":
                return "Select game mode:";
            case "Human":
                return "1. Player vs. Player";
            case "IA":
                return "2. Player vs. Computer";
            case "Enter_name":
                return "Enter your name:";
            case "Enter_name_Player":
                return "Enter Player 1's name: ";
            case "Enter_name_Player2":
                return "Enter Player 2's name:  ";
            case "Loop":
                return "Do you want to play again? (yes/no): ";
            case "Player's_turn.":
                return "'s turn. Enter row and column (e.g., 1 2): ";
            case "Invalid_move":
                return "Invalid move. Try again: ";
            case "Game_over":
                return "Game over!";
            case "Draw":
                return "It's a draw!";
            case "Win":
                return " wins!";
            case "Scores":
                return "Scores";
            case "Points":
                return " points";
            default:
                return "Mensaje no encontrado";
        }
    }
}
