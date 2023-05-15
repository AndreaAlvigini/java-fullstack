/*
Creare un programma che chieda all'utente di inserire la lunghezza del latoe restituisce in output
l'area e il perimetro del quadratp utilizzando la variabile lato
*/
import java.util.Scanner;

public class calcolaPerimetroArea {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Inserisci la lunghezza del lato ");

    int lato;
    int area;
    int perimetro;

    //lato = 5; // assegno il valore 5 alla variabile lato

    lato = input.nextInt();

    area = lato * lato;
    perimetro = lato * 4;

    if (lato >= 40 || lato < 1) { // aggiungo una seconda condizione
      System.out.println(
        "■ Non è consentito inserire una misura maggiore di 40 cm o minore di 1 cm"
      );
    } else { //se l'input è < o = a 40
      System.out.println("■ Il lato del quadrato è " + lato); // concateno testo e variabili
      System.out.println("■ Il perimetro del quadrato è " + lato * 4 + " cm");
      System.out.println("■ L'area del quadrato è " + area + " cm²");
    }
    input.close();
  }
}
/*
  Note per collaboratori 
  */
