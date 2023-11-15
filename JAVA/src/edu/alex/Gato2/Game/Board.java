package edu.alex.Gato2.Game;

public class Board {
    private char[][] grid;

    public Board(int size) {
        grid = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public void display() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
                if (j < grid[i].length - 1) {
                    System.out.print(" | "); // Agrega una barra vertical entre columnas
                }
            }
            System.out.println();

            if (i < grid.length - 1) {
                System.out.println("---------"); // Agrega una línea divisoria entre filas
            }
        }

        System.out.println();  // Agrega una línea en blanco adicional después del tablero
    }

    public boolean isCellOccupied(int row, int col) {
        return grid[row][col] != '-';
    }

    public void markCell(int row, int col, char symbol) {
        grid[row][col] = symbol;
    }

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

    public boolean isWinner(char symbol) {
        // Check rows and columns
        for (int i = 0; i < grid.length; i++) {
            if (checkLine(grid[i], symbol) || checkLine(getColumn(i), symbol)) {
                return true;
            }
        }

        // Check diagonals
        return checkLine(getDiagonal(true), symbol) || checkLine(getDiagonal(false), symbol);
    }

    private char[] getColumn(int col) {
        char[] column = new char[grid.length];
        for (int i = 0; i < grid.length; i++) {
            column[i] = grid[i][col];
        }
        return column;
    }

    private char[] getDiagonal(boolean mainDiagonal) {
        char[] diagonal = new char[grid.length];
        for (int i = 0; i < grid.length; i++) {
            diagonal[i] = mainDiagonal ? grid[i][i] : grid[i][grid.length - 1 - i];
        }
        return diagonal;
    }

    private boolean checkLine(char[] line, char symbol) {
        for (char cell : line) {
            if (cell != symbol) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return grid.length;
    }
}
