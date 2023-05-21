//package java-fullstack.es_22;
/*
 * Programma indovina un numero

Scriva numero da x a y per esempio= variabile da uno a 100
target=> numero da indovinare (11)bo

computer chiede inserisci un numero

se il numero che avete inserito è piu grande ci dice ch eè piu grande se è pi piccolo anche

finchè non indovinaimo ci chiede il numero; 

se indoviniamo finisce


 * 
 */

import java.util.Scanner;

public class guessNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numerogiocatore = 0;
        int target = 11;

        while (numerogiocatore < 100 || numerogiocatore > 0) {
            System.out.println("Inserisci un numero: ");
            numerogiocatore = input.nextInt();
              
            if (numerogiocatore > 100) {
                System.out.println("Il numero è troppo grande");
                continue;
            else if (numerogiocatore < 0) {
                    System.out.println("Il numero è troppo grande");
                    continue;
             }

            else if (numerogiocatore > target) {
                System.out.print("Hai inserito un numero più grande, riprova!");
                continue;
            }

            else if (numerogiocatore < target) {
                System.out.println("Hai inserito un numero più piccolo, riprova");
                continue;
            }

            else if (numerogiocatore == target) {
                System.out.println("Hai vinto!!! il numero da indovinare era " + target);
                break;

            }  
             else if (numerogiocatore < 0) {
                System.out.println("Il numero è troppo grande");
                continue;
            }
            
            }
        }
    }

}
