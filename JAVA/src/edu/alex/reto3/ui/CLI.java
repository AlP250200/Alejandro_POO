package edu.alex.reto3.ui;

import edu.alex.reto3.process.Conversion;

import java.util.Scanner;

public class CLI {
    public static void showMenu (){
        Scanner scanner = new Scanner(System.in);
        char opc =0;
        do {
            System.out.println("a.Convertir de decimal a binario");
            System.out.println("b.Convertir de decimal a octal");
            System.out.println("c.Convertir de decimal a hexadecimal");
            System.out.println("d.Convertir de binario a decimal");
            System.out.println("e.Convertir de octal a decimal");
            System.out.println("f.Convertir de hexadecimal a decimal");
            System.out.println("Tipo de conversión ");
            char tipo =scanner.next().charAt(0);
            System.out.println("Ingrese el decimal");
            int decimal = Integer.parseInt(scanner.nextLine());
            switch (tipo) {
                case 'a':
                    System.out.println("Se hara la conversion de " +decimal+ "a binario");
                    System.out.println(decimal+ "a es igual"+ Conversion.decimalABinario(decimal));
                    System.out.println("Quiere hacer otra conversión (s/n)");
                    opc =scanner.next().charAt(0);
                    break;
            }


        }while (opc == 's');

    }
}
