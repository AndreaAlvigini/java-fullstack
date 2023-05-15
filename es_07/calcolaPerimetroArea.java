/*
Creare un programma che chieda all'utente di inserire la lunghezza del latoe restituisce in output
l'area e il perimetro del quadratp utilizzando la variabile lato
*/

public class calcolaPerimetroArea { // classe chiamata come nome file

  public static void main(String[] args) { // lato sarà il parametro che utilizzarò per i calcoli
    int lato;
    int area;
    int perimetro;
    lato = 5; // assegno il valore 5 alla variabile lato
    area = lato * lato;
    perimetro = lato * 4;
    System.out.println(lato); // Stampa variabile lato
    System.out.print(area); //Stampa variabile lato
    System.out.println(perimetro); //Stampa variabile perimetro
  }
}
/*
  Note per collaboratori 
  */
