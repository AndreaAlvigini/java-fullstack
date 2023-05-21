import java.util.Scanner;

public class GiocoIndovinaParola {

    public static void main(String[] args) {
        String parolaDaIndovinare = "colmo";
        int tentativiRimasti = 5;
        boolean indovinato = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Benvenuto! Indovina la parola di 5 lettere.");

        while (tentativiRimasti > 0 && !indovinato) {
            System.out.print("Inserisci una parola: ");
            String tentativo = input.nextLine();

            if (tentativo.length() != 5) {
                System.out.println("Devi inserire una parola di 5 lettere.");
                continue;
            }

            if (tentativo.equalsIgnoreCase(parolaDaIndovinare)) {
                indovinato = true;
            } else {
                tentativiRimasti++;
                StringBuilder lettereCorrispondenti = new StringBuilder();

                for (int i = 0; i < 5; i++) {
                    if (tentativo.charAt(i) == parolaDaIndovinare.charAt(i)) {
                        lettereCorrispondenti.append(tentativo.charAt(i));
                    } else {
                        lettereCorrispondenti.append("_");
                    }
                }

                tentativiRimasti--;
                System.out.println("Parola errata. Le lettere corrispondenti sono: " + lettereCorrispondenti);
                System.out.println("Tentativi rimasti: " + tentativiRimasti);
            }
        }

        if (indovinato) {
            System.out.println("Complimenti, hai indovinato la parola!");
        } else {
            System.out.println("Hai esaurito i tentativi. La parola era: " + parolaDaIndovinare);
        }

        input.close();
    }
}