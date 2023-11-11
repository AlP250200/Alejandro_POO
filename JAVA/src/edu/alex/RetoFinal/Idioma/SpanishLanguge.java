package edu.alex.RetoFinal.Idioma;

public class SpanishLanguge  implements Language{
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "Bienvenido al Juego de Gato";
            case "board":
                return "Selecciona el tamaño del tablero (3 o 4): ";
            case "boardError":
                return  "Tamaño de tablero no válido. Elige 3 o 4.";
            case "ModeGame":
                return "Selecciona el modo de juego (Multijugador o IA): ";
            case "MultyPlayer":
                return "Multijugador";
            case "IA":
                return "IA";
            case  "ModeGameError":
                return "Modo de juego no válido. Elige Multijugador o IA.";
            case  "TurnPlayer:":
                return "Turno del jugador";
            case "Row":
                return "Fila:";
            case "Column":
                return "Columna: ";
            case "GameWin":
                return "¡El jugador ha ganado!";
            case "GameDraw":
                return "¡Es un empate!";
            case "MoveInvalid":
                return "Movimiento no válido. Inténtalo de nuevo.";
            case "MoveValid":
                return  "Ingrese un número válido.";
            case "TurnIA":
                return "Turno del jugador X";
            case "BoardCurrent":
                return "Tablero Actual:";


            default:
                return "Message not found";

        }
    }
}

