import java.util.Scanner;
//import java.util.Arrays;
public class CercaArray
{
    public static void main(String[] args)
    {
            Scanner input = new Scanner(System.in);//metodo input
            
            System.out.println(" Inserisci la dimensione dell'array: ");
            int dimensione = input.nextInt(); //dimensione specificata dall'utente
            int [] array= new int[dimensione]; //Creazione di un array della dimensione dell'utente
            
            System.out.println(array);

            System.out.println("Inserisci gli elementi dell'array");

            

            for (int i = 0; i < dimensione ; i++)
            { // il ciclo for continua finchè il contatore raggiunge la dimensione inserita dall'utente
                array[i] = input.nextInt();// assegno gli input dell'utente ad un array della dimensionde del contatore
                
            }
                System.out.println(array);

                System.out.println("Inserisci il numero da cercare");
                int numeroCercato = input.nextInt(); //definisco una variabile e la inizializzo con valore pari all'input dell'utente

                System.out.println(numeroCercato);

                int indice = -1; //definisco una variabile a cui do valore -1 che rappresenta l'indice di un elemento che non esiste
                for ( int i = 0; i <dimensione; i++)
                {
                    if (array[i] == numeroCercato)//Se ad un determinato indice trovi il numero che ho scelto
                    {
                        System.out.println(indice);
                        indice =i;
                        break;//esci dal programma
                    }
                }
                if (indice != -1)
                {
                    System.out.println(" Il numero si triva all'indice " + indice + "dell'array");
                }
                else
                {
                    System.out.println("il numero non è presente nell'array");
                }
        }
        
}


