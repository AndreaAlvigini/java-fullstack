
//package java-fullstack.es_23;
import java.util.Random;

public class GenerazioneCaso {
    public static void main(String[] args) {

        // Creare un oggetto dalla classe Random
        Random rand = new Random();

        // Generare un numero intero casuale
        int randomInt = rand.nextInt(100); // genera un numero casuale compreso tra 0 e 99
        System.out.println("Numero intero casuale: " + randomInt);

        // Generare un numero decimale casuale
        double randomDouble = rand.nextDouble(); // genera un numero decimale casuale compreso tra 0,0 e 99,99
        System.out.println("Numero decimale casuale: " + randomDouble);

        // Generare un valore booleano casuale
        boolean randomBoolean = rand.nextBoolean(); // genera un valore booleano casuale, vero o falso
        System.out.println("Valore booleano casuale: " + randomBoolean);

    }

}
