import java.util.Scanner;
import java.util.Random;

public class guessNumberRandom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numerogiocatore = 0;

        Random rand = new Random();

        int target = rand.nextInt(10) + 1;
        int tentativi = 0;
        int numerotentativi = 5;

        while (tentativi > numerotentativi) {

            System.out.println("Inserisci un numero: ");
            numerogiocatore = input.nextInt();
            tentativi++;
            System.out.println("hai eseguito " + tentativi + " su " + numerotentativi);

            if (numerogiocatore > target) {
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

            } else if (numerogiocatore < 0) {
                System.out.println("Il numero è troppo grande");
                continue;
            }
            System.out.println("\n");
            System.out.println("No aspetta, hai finito i tentativi =( ");

        }

    }
}
