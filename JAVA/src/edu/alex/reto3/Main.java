package edu.alex.reto3;

import edu.alex.reto3.ui.CLI;

/**
 * En esta clase main se manda a llamar la clase CLI para que se ejecute el programa pedido
 * Al ejecutar esta clase tambien se ejecutan tanto la clase conversion que se llama en la clase CLI
 * Y se ejecuta el programa
 */
public class Main {
    public static void  main (String []args){
        CLI.showMenu();
    }
}
