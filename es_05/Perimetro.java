/*
Creare un programma che chieda all'utente di inserire la lunghezza del lato e restituisce in output
l'area e il perimetro del quadratp utilizzando la variabile lato

*/
//import static java.lang.Math.*;

import java.util.Scanner;

public class Perimetro 
{

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Inserisci la lunghezza del lato "); //Richiedo la lungezza del lato
    double lato = input.nextDouble(); //leggo l'input variabile lato

    if (lato > 400)
    //metodo alternativo per creare una condizione if
        
    { //|| lato < 1)  //metto le condizioni
      System.out.println(
        "■ Non è consentito inserire una misura maggiore di 400 cm"
      );
    }

    if (lato < 1)
    {
      System.out.println(
        "■ Non è consentito inserire una misura minore di 1 cm"
      );
    } else
    {
      double power = 2; //specifico la potenza
      double area = Math.pow(lato, power); //elevo a potenza calcolando l'area
      System.out.println("■ Il perimetro del quadrato è " + lato * 4 + " cm"); //stampo il perimetro calcolandolo con lato * 4
      System.out.print("■ L'area del quadrato è " + area + " cm²"); //stampo l'area
    }
    input.close();
  }
}
/*
CIAO
*/
