
//package java-fullstack.es_27;
import java.util.Scanner;
import java.util.*;

public class GuessNumDavide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int random =(int)((Math.random() *100) +0);
        // Math.random() genera un numero Double compresa e 0,99999
        //

        Double ranNum1 = Math.random();// genera double tra 0,0 e 0,9999999
        System.out.println(ranNum1);

        Double ranNum2 = Math.random() * 10;// genera double tra 0,0 e 9,9999999
        System.out.println(ranNum2);

        int min = 1;
        Double ranNum3 = (Math.random() * (10 - min)) + min;// genera double
        System.out.println(ranNum3);

        // se vogliamo generare i numeri tra 1 e 10
        Double ranNum4 = (Math.random() * (10 - 1)) + 1;// genera double
        System.out.println(ranNum4);

        int numToGuess = (int) ((Math.random() * (100 - min)) + min);
        System.out.println(numToGuess);

        while (true) {
            System.out.println("Indovina un numero tra 1 e 100");
            int userGuess = input.nextInt();

            if (userGuess == numToGuess) {
                System.out.println("Bravo hai indovinato, in numero era " + numToGuess);
                break;

            } else if (userGuess < numToGuess) {
                System.out.println("Il numero che hai inserito è troppo piccolo, RIPROVA!");

            } else if (userGuess > numToGuess) {
                System.out.println("Il numero che hai inserito è troppo grande, RIPROVA!");

            }

        }

    }

}
