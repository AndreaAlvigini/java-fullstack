
//package esercitazioni.es_12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntFunction;

public class PrintList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> fruits = new ArrayList<String>();

        fruits.add("Mela"); // il metodo add della classe aggiunge un elemento
        fruits.add("Banana");
        fruits.add("Arancia");
        // fruits.clear();// METODO PER SVUOTARE LA LISTA
        // fruits.remove(2); // metodo per rimuovere un elemento specifico
        // fruits.size(); // restituisce la grandezza della lista
        // fruits.isEmpty();

        for (String fruit : fruits) {

            System.out.println(fruit);

        }

        System.out.println("Quale elemento vuoi rimuovere dalla lista?");
        String frutto = input.next();

        if (frutto.equals("Mela") || frutto.equals("mela")) {
            fruits.remove(0);
        } else if (frutto.equals("Banana") || frutto.equals("banana")) {
            fruits.remove(1);
        } else if (frutto.equals("Arancia") || frutto.equals("arancia")) {
            fruits.remove(2);
        }
        /*
         * int daEliminare = input.nextInt;
         * fruits.remove(daEliminare);
         */
        System.out.println("\n");
        System.out.println("Ecco la lista aggiornata!");
        System.out.println("\n");
        // System.out.println(fruits.isEmpty());
        for (String fruit : fruits) {

            System.out.println(fruit);

        }
    }

}
