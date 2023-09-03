package edu.alex.reto2.boletos.ui;

import edu.alex.reto2.boletos.process.Ticket;

import java.util.Scanner;

/**
 * Aqui esta la clase CLI que es la que interactua con el usuario en el se muestra el menu del parque
 * A su vez  muestra el tipo de boleto y muestra el precio del boleto llamando la clase Ticket
 */
public class CLI {
    public static void showMenu (){
        Scanner scanner = new Scanner(System.in);
        char opt;

        do {
            System.out.println("A. Adulto ");
            System.out.println("N. Niño");
            System.out.println("I. Adulto Mayor (INAMPAM)");
            System.out.println("B. Adulto Mayor(SIN INAMPAM");

            System.out.println("Tipo de boleto:");
            char tipo = scanner.next().charAt(0);


            Ticket.Ticket(tipo);

            System.out.println("Desea otro boleto (s/n)");
            opt = scanner.next().charAt(0);
        } while (opt == 's');

        System.out.println("Programa finalizado, vuelva pronto");
    }
}
