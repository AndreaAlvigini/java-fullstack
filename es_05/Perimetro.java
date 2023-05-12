/*
Creare un programma che chieda all'utente di inserire la lunghezza del latoe restituisce in output
l'area e il perimetro del quadratp utilizzando la variabile lato
*/
import static java.lang.Math.*;

import java.util.Scanner;

public class Perimetro {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Inserisci la lunghezza del lato "); //Richiedo la lungezza del lato
    double lato = input.nextDouble(); //leggo l'input variabile lato
    if (lato >= 400 || lato < 1) {
      System.out.println("Il lato del quadrato non può essere più di 400 cm");
    } else {
      double power = 2;
      double area = Math.pow(lato, power);
      System.out.println("■ Il perimetro del quadrato è " + lato * 4 + " cm");
      System.out.print("■ L'area del quadrato è " + area + " cm²");
    }
    input.close();
  }
}
/*
CIAO    
*/
