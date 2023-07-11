/*
  Programma che legge diversi tipi di input
*/

import java.util.Scanner; //importo la classe Scanner dal package java.util

public class InputType { //Nome della classe

public static void main(String[] args) { //metodo main, inizio del programma
    Scanner input = new Scanner(System.in); // crea oggetto scanner che ci permette di leggere input
    
  double num1;
  String str;
  char c;
  

    System.out.println("Inserisci un numero decimale: "); // Stampa la prima richiesta: Numero Decimale
    double num1 = input.nextDouble(); //variabile decimale num 1
    System.out.println("il numero decimale inserito è: " + num1); //stampa il numero decimale inserito num1

    System.out.println("Inserisci una stringa: "); // stampa seconda richiesta: Stringa
    String str = input.next(); //legge anche il carattere di a capo
    //String str = input.nextln();
    System.out.println("inserisci un carattere: "); //Stampa terza richiesta: Carattere
    char c = input.next().charAt(0); //legge il carattere inserito

    System.out.println("La stringa inserita è: " + str); //stampa la stringa inserita str
    System.out.println("Il carattere inserito è: " + c); //stampa il carattere inserito c, ovvero il primo carattere di ciò che l'utente scrive
  }
}
