import java.util.random;
import java util.scanner;

public class indovinaTentativiCaso {

    public static void main(String[] args) {
        Random rand = new Random();

        int target = rand.nextInt(10) + 1;
        
        Scanner input = new Scanner(System.in);
        

        

        int tentativo;
        boolean vincita = false;
        int numeroDitentativi = 0;

        while (vincita == false) {
            System.out.println("Indovina un numero tra 1 e 10: ");
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
        System.out.println("Bravo! hai indovinato in " + numeroDitentativi + ".  il numero era " + target);

        input.close();
        

        
    }

}
