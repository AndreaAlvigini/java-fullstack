import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class calcolaModi2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Map<String, Integer[]> modeScale = new HashMap<>();
        
        /*modeScale.put("Ionian", new Integer[] {2, 2, 1, 2, 2, 2, 1});
        modeScale.put("Dorian", new Integer[] {2, 1, 2, 2, 2, 1, 2});
        modeScale.put("Phrygian", new Integer[] {1, 2, 2, 2, 1, 2, 2});
        modeScale.put("Lydian", new Integer[] {2, 2, 2, 1, 2, 2, 1});
        modeScale.put("Mixolydian", new Integer[] {2, 2, 1, 2, 2, 1, 2});
        modeScale.put("Aeolian", new Integer[] {2, 1, 2, 2, 1, 2, 2});
        modeScale.put("Locrian", new Integer[] {1, 2, 2, 1, 2, 2, 2});*/

        Map<Integer,String> modeSelector = new LinkedHashMap<>();
    
        modeSelector.put(1,"Ionian");
        modeSelector.put(2,"Dorian");
        modeSelector.put(3,"Phrygian");
        modeSelector.put(4,"Lydian");
        modeSelector.put(5,"Mixolydian");
        modeSelector.put(6,"Aeolian");
        modeSelector.put(7,"Locrian");
        
        
        System.out.println("select mode:");
        System.out.println("1-Ionian");
        System.out.println("2-Dorian");
        System.out.println("3-Phrygian");
        System.out.println("4-Lydian");
        System.out.println("5-Mixolidian");
        System.out.println("6-Aeolian");
        System.out.println("7-Locrian");



        int userMode = input.nextInt();
        String selectedMode= modeSelector.get(userMode);
        
        System.out.println(selectedMode);

        /*Array di stringhe contentene la scala cromatica*/
        //String[] notes = {"C", "C#", "D", "Eb", "E", "F", "F#", "G","G#", "A", "Bb", "B"};
        /*Richiedo all'utente la nota*/
        //System.out.println("Insert your root note:");
        //String rootNote = input.nextLine();
        
        // Richiedo all'utente un modo musicale
        //System.out.println("Insert a music mode: (ionian, dorian, phrygian, lydian, mixolydian, aeolian, locrian)");
        //String selectedMode = input.nextLine().toLowerCase();
        //int currentNote= 0;

        //String[] selectedScale = scaleCreator(rootNotes, selectedNote);


        //Integer[] intervals = modeScale.get(selectedScale);



        
    
        
    }
}

