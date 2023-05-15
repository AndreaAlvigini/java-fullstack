/*
Creare un programma che chieda all'utente di inserire la lunghezza del latoe restituisce in output
l'area e il perimetro del quadratp utilizzando la variabile lato
*/
import java.util.Scanner; //libreria per poter utilizzare i metodi di scanner

public class calcolaPerimetroArea { // classe chiamata come nome file

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //creo un oggetto scanner chiamato input;
    System.out.print("Inserisci la lunghezza del lato "); //Richiedo la lungezza del lato

    int lato; // lato sarà il parametro che utilizzarò per i calcoli
    int area;
    int perimetro;

    //lato = 5; // assegno il valore 5 alla variabile lato

    lato = input.nextInt();

    area = lato * lato;
    perimetro = lato * 4;
    System.out.println(lato); // Stampa variabile lato
    System.out.println(area); //Stampa variabile lato
    System.out.println(perimetro); //Stampa variabile perimetro
    input.close();
  }
}
/*
  Note per collaboratori 
  */
