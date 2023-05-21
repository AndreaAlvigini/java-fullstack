
//package esercitazioni.es_12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntFunction;

public class PrintListStr {
    public static void main(String[] args) 
      {
        Scanner input = new Scanner(System.in);
        List<String> fruits = new ArrayList<String>();

        fruits.add("Mela"); // il metodo add della classe aggiunge un elemento
        fruits.add("Banana");
        fruits.add("Arancia");

        for (String fruit : fruits) 
        {
            System.out.println(fruit);
        }


      }

        input.close();

    }}
