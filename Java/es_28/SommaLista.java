import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SommaLista 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        System.out.println("Inserisci gli elementi della lista (Inserisci 0 per terminare l'inserimento)");
        int elemento = input.nextInt();
        while (elemento !=0)//finchè i numeri che inserisco nella lista sono diversi da 0 il programma esegue questo ciclo
        {
            lista.add(elemento);//l'elemento viene aggiunto solamente se non è zero, appena inserisco lo zero i numeri successivi non vengono aggiunti alla lista
            elemento = input.nextInt();
        }
        int somma = 0;
        for (Integer numero:lista)//per ogni numero della lista
        {
            somma += numero;
        }
        System.out.println("La somma degli elementi della lista è : " + somma +".");
        input.close();
    }
}
