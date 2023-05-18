
//package esercitazioni.es_12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntFunction;

public class PrintListStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> fruits = new ArrayList<String>();// seconda lista
        List<String> carrello = new ArrayList<>();// devo fare add

        fruits.add("Mela"); // il metodo add della classe aggiunge un elemento
        fruits.add("Banana");
        fruits.add("Arancia");

        System.out.println("Lista della frutta disponibile");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Se vuoi aggiungere al carrello della frutta premi +1");
        String userchoice = input.next();

        if (userchoice.equals("+1")) {

            while (fruits.isEmpty() == false) {
                System.out.println("Quale articolo vuoi mettere nel carrello?");
                String scelta = input.next();

                fruits.remove(scelta);
                carrello.add(scelta);

                for (String fruit : carrello) {
                    System.out.println("nel carrello è stata aggiunta: " + carrello);

                }

                System.out.println("Sono ancora disponibili: ");
                for (String fruit : fruits) {
                    System.out.println(fruit);

                }

            }
        } else {
            System.out.println("Grazie lo stesso, buona giornata");
        }

    }

}
// fruits.isEmpty();