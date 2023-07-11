/*
forEach dell'esercitazione e breve spiegazione 
*/

public class forEach {

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6 };
    for (int num : numbers) {
      int dim = numbers.length; //la classe array ha un metodo che descrive la quantità degli elementi

      //System.out.println(num);
      System.out.println("numero" + num + " di " + dim + " elementi ");
    }
  }
}
/*
  Note per collaboratori 
  */
