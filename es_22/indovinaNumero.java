
//package java-fullstack.es_22;
import java.util.Scanner;

public class indovinaNumero {
    public static void main(String[] args) {
        int target = 11;
        Scanner input = new Scanner(System.in);

        int tentativo;
        boolean vincita = false;
        int tentativi = 0;

        while (vincita == false) {
            System.out.println("Inserisci un numero: ");
            tentativo = input.nextInt();
            tentativi++;

            if (tentativo == target) {
                vincita = true;
            } else if (tentativo < target) {
                System.out.println("troppo basso, riprova!");
            } else if (tentativo > target) {
                System.out.println("troppo alto, riprova!");
            }
        }
        System.out.println("Bravo! hai indovinato in " + tentativi + ".  il numero era " + target);

        input.close();

    }

}
