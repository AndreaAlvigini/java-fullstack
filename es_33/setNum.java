import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
public class setNum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Set<Integer> setNumeri = new HashSet<Integer>();
        System.out.println("Inserisci gli interi separati da uno spazio: ");
        String[] numeri = input.nextLine().split(" ");

        for (String numero : numeri)
        {
            setNumeri.add(Integer.parseInt(numero));
        }
        System.out.println("Il numero degli elementi originari: "+ numeri.length);
        System.out.println("Il numero degli elementi del Set senza duplicati è: "+ setNumeri.size());
        System.out.println("Il Set senza duplicati è: ");
        for (int numero : setNumeri)
        {
            System.out.println(numero + " ");
        }
        input.close();

    }
}
/*nel caso non viene visualizzato "è" nel terminale,restituendo Ã¨; basta eseguire il comando java con questi attributi java-Dfile.encoding="UTF-8" "NOMEFILE"  */
