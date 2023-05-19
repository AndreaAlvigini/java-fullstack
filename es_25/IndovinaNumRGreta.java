//package java-fullstack.es_25;

import java.util.Random;
import java.util.Scanner;

public class IndovinaNumRGreta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random casuale = newRandom();

        int casual = casuale.nextInt(100) + 1;
        int numeroUtente;

        do {

            System.out.println("Indovina un numero tra 1 e 100: ");
            numeroUtente = input.nextInt();
            if (numeroUtente < casual) {
                System.out.println("Il numero che hai scelto è troppo basso");
            } else if (numeroUtente > casual) {
                System.out.println("Il nunrei che hai scelto è troppo alto");
            }

        } while (numeroUtente != casual);
        System.out.println("complimenti hai indovinato il numero: " + casual);

    }

}
