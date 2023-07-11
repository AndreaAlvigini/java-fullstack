
//package esercitazioni.es_18;
import java.util.Scanner;

import javax.swing.InputMap;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        do { // viene eseguito almeno la prima volta
            System.out.println("Inserisci un numero (inserisci 0 per uscire): ");
            num = input.nextInt();
            System.out.println("Hai inserito: " + num);
        } while (num != 0); // I viene eseguito soltanto soltanto se viene soddisfatta questa condizione
                            // (numero inserito diverso da 0)
        input.close();
    }
}
