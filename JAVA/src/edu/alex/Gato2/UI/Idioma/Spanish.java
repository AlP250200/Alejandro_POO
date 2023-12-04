package edu.alex.Gato2.UI.Idioma;

public class Spanish implements Language{
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "Bienvenido a Tic-Tac-Toe!";
            case "game_mode":
                return "Selecciona modo de juego:";
            case "Human":
                return "1.Jugador vs jugador";
            case "IA":
                return "2. Jugador vs Computadora ";
            case "Enter_name":
                return "Ingrese su nombre: ";
            case "Enter_name_Player":
                return "Ingrese el nombre del Jugador 1:";
            case "Enter_name_Player2":
                return "Ingrese el nombre del Jugador 2:";
            case "Loop":
                return "¿Quieres jugar de nuevo? (yes/no):";
            case "Player's_turn.":
                return "Su turnp. Ingresa fila y columna (por ejemplo, 1 2):";
            case "Invalid_move":
                return "Movimiento inválido. Inténtalo de nuevo: ";
            case "Game_over":
                return "Juego terminado";
            case "Draw":
                return "¡Es un empate!";
            case "Win":
                return " gana!";
            case "Scores":
                return "Puntuaciones";
            case "Points":
                return " puntos";
            default:
                return "Mensaje no encontrado";
        }
    }
}
