
//package esercitazioni.es_12;
import java.util.ArrayList;
import java.util.List;

public class PrintList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Mela"); // il metodo add della classe aggiunge un elemento
        fruits.add("Banana");
        fruits.add("Arancia");
        fruits.clear();// METODO PER SVUOTARE LA LISTA
        // fruits.remove(2); // metodo per rimuovere un elemento specifico
        // fruits.size(); // restituisce la grandezza della lista
        fruits.isEmpty();
        System.out.println(fruits.isEmpty());
        for (String fruit : fruits) {

            // System.out.println(fruits.size());
            System.out.println(fruit);

        }
    }

}
