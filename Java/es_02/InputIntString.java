/*
Utilizzo di classi scanner e numeriche + condizione If Else 
Abbiamo importato la classe Scanner dal package java.util,
specificando poi il nome della classe, in questo caso uguale al nome del file InputIntString.
Abbiamo poi inserito il metodo main, il punto iniziale del programma.
Per prima cosa il programma crea un oggetto Scanner che permette di leggere l'input dalla console, di seguito 
stampa la prima richiesta "inserisci il tuo nome", l'input verrà letto nella linea di codice seguente sottoforma
di stringa, passando così alla seconda richeiesta stampata dal programma "inserisci la tua età", il secondo input,
l'età, verrà quindi letto come come numero intero.
Abbiamo quindi specificato un altro numero intero 18 per impostare una soglia di confronto.
Di seguito inizia la parte di confronto if else, che ci permette di dare un risultato diverso, ovvero il messaggio 
"nome + non hai 18 anni", nel caso invece l'età inserita è maggiore di 18, la parte else ci restituisce invece
"Ciao, " +  nome   + " Hai "  + eta + " anni!". Infine con input.close chiudiamo lo scanner.
In caso 





*/

import java.util.Scanner; // importa la classe scanner//

public class InputIntString {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //crea un oggetto scanner che legge l'input dalla console (System.in)//

    System.out.println("inserisci il tuo nome: "); //scrivi nella console "inserisci il tuo nome//
    String nome = input.next(); //legge la prossima stringa dall'input//

    System.out.print("inserisci la tua età: "); //Stampa inserisci la tua età nella console //
    int eta = input.nextInt(); // legge il prossimo intero dall'input//

    int soglia = 18; // imposto valore di soglia

    if (eta < soglia) { //inserisco una condizione per verificare età utente
      System.out.print(nome + " non hai 18 anni"); //se l'input è minore ricevo messaggio di errore
    } else {
      System.out.println("Ciao, " + nome + " Hai " + eta + " anni! "); // stampa "ciao *nome* hai *età* nella console//
    }
    input.close(); // chiude lo scanner (non obbligatorio)//
  }
}
