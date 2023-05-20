//package java_repository.java-fullstack.CalcolaScala;
//import java.lang.reflect.Array;
import java.util.Scanner;

public class CalcolaScalaProva {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String [] notes = {"C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "Bb", "B"};
        int [] intervalsIonian = {2, 2, 1, 2, 2, 2, 1};
        int [] intervalsDorian = {2, 1, 2, 2, 2, 1, 2};
        int [] intervalsPhrygian = {1, 2, 2, 2, 1, 2, 2};
        int [] intervalsLydian = {2, 2, 2, 1, 2, 2, 1};
        int [] intervalsMixolydian = {2, 2, 1, 2, 2, 1, 2};
        int [] intervalsAeolian = {2, 1, 2, 2, 1, 2, 2};
        int [] intervalsLocrian = {1, 2, 2, 1, 2, 2, 2};

            System.out.println("Insert a music mode and i'll show you the scale");

            System.out.println("choose between, ionian, dorian, phrygian, lydian, mixolidian, aeolian, locrian.");
            
            String selectedScale = input.nextLine().toLowerCase();
            System.out.println(selectedScale);
            
            int[] selectInterval;
            if (selectedScale.equals("ionian"))
            {
            selectInterval =  intervalsIonian;
            }
            if  (selectedScale.equals("dorian")) 
            {
                selectInterval = intervalsDorian;                
            } 
            if  (selectedScale.equals("phrygian")) {
                selectInterval = intervalsDorian;
                
            } 
            if  (selectedScale.equals("lydian")) 
            {
                selectInterval = intervalsLydian;                
            } 
            if  (selectedScale.equals("mixolidian")) 
            {
                selectInterval = intervalsMixolydian;                
            } 
            if  (selectedScale.equals("aeolian")) 
            {
                selectInterval = intervalsAeolian;               
            } 
            if  (selectedScale.equals("locrian")) 
            {
                selectInterval = intervalsLocrian;                
            } 
            else 
            {
                System.out.println("Invalid option!");
                //scanner.close();
                return;
            }
            
            int currentNote = 0;
            for (int interval : selectInterval) 
            {
                System.out.println(notes(currentNote));
                currentNote = (currentNote + interval);
            }
            
    }
    //scanner.close
}