//package java-fullstack.es_26;
import java.util.Arrays;
import java.util.Scanner;

public class copiaArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci la dimensione dell'array: ");//chiedo la dimensiono dell'array primario 
        int dimensione  = input. nextInt();//con questa variabile creerò la dimensione dell'array
        int [] array = new int[dimensione];//creo il primo array, che avrà la grandezza di "dimensione"

        System.out.println("inserisci gli elementi dell'array: ");//richiedo che elementi inserire nell'array
        for (int i=0; i < dimensione; i++)
        {
            array[i] = input.nextInt();
        }
        int[] arrayCopia = new int[dimensione];// creo un secondo array che copierà gli elementi del primo
        for (int i = 0; i < dimensione; i++)
        {
            arrayCopia[i] = array[i];
        }
        System.out.println("L'array originale è:  "+ Arrays.toString(array));//st
        System.out.println("L'array copia è:  "+ Arrays.toString(arrayCopia));
        input.close();
    }
}
