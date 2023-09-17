package edu.alex.reto4.process;

/**
 * En esta clase se incluyen todos los metodos para la generación del reporte que se necesita
 * por parte del usuario en totoal se hay tres metodos.
 */
public class GeneradorReporte {
    /**
     * @param ventas el arreglo bidimensional pre-cargado
     * @return Regresa el resultado de cada sabor mas productivo por trimestre
     * Este metodo sirve para conocer el resultado de cada sabor mas productivo por trimestre
     */
    public static int getSaborMasProductivo(int[][] ventas) {
        int saborMasProductivo = 0;
        for (int i = 0; i < ventas.length; i++) {
            int saborMasVendido = Integer.MIN_VALUE;
            int saborMasVendidoIndex = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                if (ventas[i][j] > saborMasVendido) {
                    saborMasVendido = ventas[i][j];

                }
                System.out.print(ventas[i][j] + " ");
            }
            System.out.print("    **    " + saborMasVendido);
            System.out.println();
        }
        return saborMasProductivo;
    }

    /**
     * @param ventas el arreglo bidimimensional pre-cargado
     * @return Regresa el resultado del sabor mas vendido por trimestre
     * Este metodo sirve para conocer el sabor mas vendido por trimestre
     */
    public static int getTrimestral(int[][] ventas) {
        int valorTrimestral=0;
        int filas = ventas.length;
        int columnas = ventas[0].length;
        for (int j = 0; j < columnas; j++) {
            valorTrimestral = ventas[0][j];
            for (int i = 1; i < filas; i++) {
                if (ventas[i][j] > valorTrimestral) {
                    valorTrimestral = ventas[i][j];
                }
            }
            System.out.println("Sabor más vendido por trimestre "+ j + ": " + valorTrimestral);
        }
        return valorTrimestral;
    }

    /**
     * @param ventas es el arreglo bidimensional pre-cargado
     * @return Da el resultado del trimestre mas vendido sin importar el sabor además de la sumatoria de cada trimestre
     * Este metodo sirve para saber el ttrimestre mas vendido sin importar el sabor mas la sumatoria de cada trimestre
     */
    public static int sumaColumnas(int[][] ventas) {
        int suma = 0;
        for (int x = 0; x < ventas[0].length; x++) {
            System.out.print("___");
        }
        System.out.println();
        for (int x = 0; x < ventas[0].length; x++) {
            for (int y = 0; y < ventas.length; y++) {
                suma += ventas[y][x];
            }
            System.out.printf("%d ", suma);
        }
        System.out.println();
        int mayor = 0;
        if (suma > mayor) {
            mayor = suma;
        }
        System.out.println("El trimestre más vendido fue: " + mayor);
        return suma;
    }



}
