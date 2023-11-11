package edu.alex.RetoFinal.Idioma;

public class EnglishLanguage implements Language{
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "Welcome to the Cat's Game";
            case "board":
                return "Select board size (3 or 4):";
            case "boardError":
                return   "Invalid board size. Choose 3 or 4.";
            case "ModeGame":
                return "Select game mode (Multiplayer or AI):";
            case "MultyPlayer":
                return "MultyPlayer";
            case "IA":
                return "AI";
            case  "ModeGameError":
                return "Invalid game mode. Choose Multiplayer or AI.";
            case  "TurnPlayer:":
                return "Player's turn";
            case "Row":
                return "Row";
            case "Column":
                return "Column";
            case "GameWin":
                return " Player X has won!";
            case "GameDraw":
                return "It's a draw!";
            case "MoveInvalid":
                return "Invalid move. Try again";
            case "MoveValid":
                return  "Enter a valid number.";
            case "TurnIA":
                return "Player X's turn";
            case "BoardCurrent":
                return "Current Board:";
            default:
                return "Message not found";

        }
    }
}
