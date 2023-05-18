/*
STAMPA SOMMA  
Creare programma che stampi somma di due numeri

*/
import java.util.Scanner;

public class StampaSomma {

  // non posso inserire altro codice fuori dal metodo Main
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    //System.out.print("+");
    int b = input.nextInt();

    /*int a = 1;
    int b = 2;
    int c = a + b;
    */
    //System.out.print("La somma è " + c);
    System.out.print(a + b);
  }
}
/*  
Note per collaboratori 
*/
