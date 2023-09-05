package edu.alex.reto3.process;

public class Conversion {
    public static String decimalABinario (int decimal){
        return Integer.toBinaryString(decimal);
    }
    public static String decimalAOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static int binarioADecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }

    public static int octalADecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static int hexadecimalADecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16);
    }
}
