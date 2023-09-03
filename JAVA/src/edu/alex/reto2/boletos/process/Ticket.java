package edu.alex.reto2.boletos.process;

import edu.alex.reto2.boletos.ui.CLI;

public class Ticket {
    public static void Ticket(char tipo) {
        int ADULTO = 100;
        int NIÑO = 70;
        int AMSC = 70;
        int INAPAM = 50;
        switch (tipo) {
            case 'A':
                System.out.println("El boleto tiene un valor de " + ADULTO);
                break;
            case 'N':
                System.out.println("El boleto tiene un valor de " + NIÑO);
                break;
            case 'I':
                System.out.println("El boleto tiene un valor de " + INAPAM);
                break;
            case 'B':
                System.out.println("El boleto tiene un valor de " + AMSC);
                break;
            default:
                System.out.println("Tipo de boleto no válido.");
        }
    }
}