
//package java-fullstack.es_22;
import java.util.Random;
import java.util.Scanner;

public class CristianIndovinaNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(10) + 1;

        int tentativo;
        boolean vincita = false;
        int numeroDitentativi = 0;

        while (vincita == false) {
            System.out.println("Inserisci un numero tra 1 e 10: ");
            tentativo = input.nextInt();
            numeroDitentativi++;

            if (tentativo == target) {
                vincita = true;
            } else if (tentativo < target) {
                System.out.println("troppo basso, riprova!");
            } else if (tentativo > target) {
                System.out.println("troppo alto, riprova!");
            }
        }

        System.out.println("Bravo! hai indovinato in " + numeroDitentativi + " tentativi,  il numero era " + target);

        input.close();

    }

}
