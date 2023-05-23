import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//modificare poi acctto inserimento tempo della coda solo se maggiore di 0
public class TempoCoda
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Queue<Integer> codaClienti = new LinkedList<Integer>();
        Queue<Integer> codaTempoServizio = new LinkedList<Integer>();
        System.out.println("Inserisci il numero dei clienti");
        int numeroClienti = input.nextInt();
        for (int i = 1 ; i <=   numeroClienti; i++)
        {
            System.out.println(" inersici il tempo di servizio per il cliente " +i+":");
            int TempoServizio =input.nextInt();
            codaClienti.add(i);
            codaTempoServizio.add(TempoServizio);
        }
        int tempoTotale = 0;
        int tempoTrascorso = 0;
        while (!codaClienti.isEmpty())
        {
            int clienteCorrente = codaClienti.remove();
            int tempoServizioCorrente = codaTempoServizio.remove();
            tempoTotale = tempoTrascorso  + tempoServizioCorrente;
            tempoTrascorso += tempoServizioCorrente;
        }
        System.out.println("Il  tempo totale di attesa per tutti i clienti è " +tempoTotale +" minuti.");
        input.close();
    }
    
}
