/*
Creare un programma che chieda all'utente di inserire la lunghezza del latoe restituisce in output
l'area e il perimetro del quadratp utilizzando la variabile lato
*/

import java.util.Scanner;

public class calcolaPerimetroArea {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci il tuo nome ");
    String nome = input.nextLine();

    System.out.print("Inserisci la lunghezza del lato ");
    int lato;
    lato = input.nextInt();
    int area;
    int perimetro;
    //int soglia = 40
    //lato = 5; // assegno il valore 5 alla variabile lato

    area = lato * lato;
    perimetro = lato * 4;

    if (lato >= 40) {
      System.out.println(
        nome +
        " ■ Non è consentito inserire una misura maggiore o uguale a 40 cm"
      );
    }

    if (lato < 1) {
      System.out.println(nome + " ■ nome Il valore inserito è troppo piccolo");
    } else {
      //se l'input è < o = a 40
      System.out.println(nome + " ■ Il lato del quadrato è " + lato); // concateno testo e variabili
      System.out.println(
        nome + " ■ Il perimetro del quadrato è " + lato * 4 + " cm"
      );
      System.out.println(nome + " ■ L'area del quadrato è " + area + " cm²");
    }

    input.close();
  }
}
/*
Note per collaboratori 
*/
