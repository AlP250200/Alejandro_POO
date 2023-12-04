package edu.alex.Gato2.Game;
/**
 * La clase Board representa el tablero de un juego de Gato (Tic Tac Toe).
 * Permite realizar movimientos, mostrar el tablero y verificar el estado del juego.
 */
public class Board {
    private char[][] grid;
    /**
     * Constructor para crear un tablero de juego de tamaño determinado.
     * @param size Tamaño del tablero (ancho y alto)
     */
    public Board(int size) {
        grid = new char[size][size];
        initializeBoard();
    }

    /**
     * Métodos
     */


    /**
     * Inicializa el tablero con celdas vacías representadas por el carácter '-'.
     */

    private void initializeBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '-';
            }
        }
    }

    /**
     * Muestra el tablero en la consola, representando el estado actual del juego.
     */
    public void display() {
        System.out.print("  ");
        for (int i = 1; i <= grid.length; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
                if (j < grid[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();

            if (i < grid.length - 1) {
                System.out.print("  ");
                for (int k = 0; k < grid.length * 4 - 1; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }

        System.out.println();
    }

    /**
     * Verifica si una celda en el tablero está ocupada.
     * @param row Fila de la celda
     * @param col Columna de la celda
     * @return true si la celda está ocupada, de lo contrario false
     */

    public boolean isCellOccupied(int row, int col) {
        return grid[row][col] != '-';
    }

    /**
     * Marca una celda del tablero con un símbolo dado.
     * @param row Fila de la celda
     * @param col Columna de la celda
     * @param symbol Símbolo a marcar en la celda
     */

    public void markCell(int row, int col, char symbol) {
        grid[row][col] = symbol;
    }

    /**
     * Verifica si el tablero está completamente lleno.
     * @return true si el tablero está lleno, de lo contrario false
     */
    public boolean isFull() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Verifica si un jugador con un símbolo dado ha ganado el juego.
     * @param symbol Símbolo del jugador
     * @return true si el jugador ha ganado, de lo contrario false
     */

    public boolean isWinner(char symbol) {
        for (int i = 0; i < grid.length; i++) {
            if (checkLine(grid[i], symbol) || checkLine(getColumn(i), symbol)) {
                return true;
            }
        }

        return checkLine(getDiagonal(true), symbol) || checkLine(getDiagonal(false), symbol);
    }

    /**
     * Obtiene una columna específica del tablero.
     * @param col Índice de la columna
     * @return Un array representando la columna
     */
    private char[] getColumn(int col) {
        char[] column = new char[grid.length];
        for (int i = 0; i < grid.length; i++) {
            column[i] = grid[i][col];
        }
        return column;
    }
    /**
     *
     * Obtiene una diagonal del tablero (principal o secundaria).
     * @param mainDiagonal true para la diagonal principal, false para la secundaria
     * @return Un array representando la diagonal
     */
    private char[] getDiagonal(boolean mainDiagonal) {
        char[] diagonal = new char[grid.length];
        for (int i = 0; i < grid.length; i++) {
            diagonal[i] = mainDiagonal ? grid[i][i] : grid[i][grid.length - 1 - i];
        }
        return diagonal;
    }
    /**
     *
     * Verifica si una línea dada está ocupada por un símbolo específico.
     * @param line La línea a verificar
     * @param symbol El símbolo a buscar en la línea
     * @return true si toda la línea está ocupada por el símbolo dado, de lo contrario false
     */
    private boolean checkLine(char[] line, char symbol) {
        for (char cell : line) {
            if (cell != symbol) {
                return false;
            }
        }
        return true;
    }
    /**
     * Obtiene el tamaño del tablero.
     * @return El tamaño del tablero (ancho/alto)
     */
    public int getSize() {
        return grid.length;
    }
}
