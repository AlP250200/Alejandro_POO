package edu.alex.reto2.boletos.ui;

import edu.alex.reto2.boletos.process.Ticket;

import java.util.Scanner;

public class CLI {
    public static void showMenu (){
        Scanner scanner = new Scanner(System.in);
        char opt;

        do {

            System.out.println("Tipo de boleto:");
            char tipo = scanner.next().charAt(0);

            // Llamar al método de procesamiento de boleto de la clase Proceso
            Ticket.Ticket(tipo);

            System.out.println("Desea otro boleto (s/n)");
            opt = scanner.next().charAt(0);
        } while (opt == 's');

        System.out.println("Programa finalizado, vuelva pronto");
    }
}
