import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class calcolaModi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Array di stringhe contenente la scala cromatica
        String[] notes = {"C", "C#", "D", "Eb", "E", "F", "F#", "G","G#", "A", "Bb", "B"};
        //Richiedo all'utente la nota
        
        
        System.out.println("Insert root note:");
        String rootNote = input.nextLine();
        
        
        int currentNote= 0;
        switch (rootNote)//a seconda della nota inserita il programma capirà da che nota partire ("currentNote")
        {
            case "C":
            case "B#":
            currentNote = 0;
            break;
            case "C#":
            case "Db":
            currentNote = 1;
            break;
            case "D":
            currentNote = 2;
            break;
            case "D#":
            case "Eb":
            currentNote = 3;
            break;
            case "E":
            currentNote = 4;
            break;
            case "F":
            case "E#":
            currentNote = 5;
            break;
            case "F#":
            case "Gb":
            currentNote = 6;
            break;
            case "G":
            currentNote = 7;
            break;
            case "G#":
            case "Ab":
            currentNote = 8;
            break;
            case "A":
            currentNote = 9;
            break;
            case "Bb":
            case "A#":
            currentNote = 10;
            break;
            case "B":
            case "Cb":
            currentNote = 11;
            break;
            default:
            break;
        }
        // Array numerici contenenti gli intervalli delle scale modali
        int[] IntervalsIonianScale = {2, 2, 1, 2, 2, 2, 16};
        int[] IntervalsDorianScale = {2, 1, 2, 2, 2, 1, 2};
        int[] IntervalsPhrygianScale = {1, 2, 2, 2, 1, 2, 2};
        int[] IntervalsLydianScale = {2, 2, 2, 1, 2, 2, 1};
        int[] IntervalsMixolydianScale = {2, 2, 1, 2, 2, 1, 2};
        int[] IntervalsAeolianScale = {2, 1, 2, 2, 1, 2, 2};
        int[] IntervalsLocrianScale = {1, 2, 2, 1, 2, 2, 2};
        
        
        //tramite Map posso scegliere un modo digitando il numero corrispondente
        Map<Integer,String> modeSelector = new LinkedHashMap<>();
        //Assegno i numeri ai modi
        modeSelector.put(1,"Ionian");
        modeSelector.put(2,"Dorian");
        modeSelector.put(3,"Phrygian");
        modeSelector.put(4,"Lydian");
        modeSelector.put(5,"Mixolydian");
        modeSelector.put(6,"Aeolian");
        modeSelector.put(7,"Locrian");
        
        //Richiedo la selezione del modo
        System.out.println("select a music mode:");
        System.out.println("1 - Ionian");
        System.out.println("2 - Dorian");
        System.out.println("3 - Phrygian");
        System.out.println("4 - Lydian");
        System.out.println("5 - Mixolidian");
        System.out.println("6 - Aeolian");
        System.out.println("7 - Locrian");
        int userMode = input.nextInt();
        String selectedMode= modeSelector.get(userMode);
        //se il modo selezionato corrisponde al modo ionico assegnerò alla variabile intervals (che è un array di numeri) gli intervalli della scala ionica e così via per le altre scale
        int[] intervals;
        if (selectedMode.equals("Ionian"))
            {
                intervals = IntervalsIonianScale;
            }
            else if (selectedMode.equals("Dorian"))
            {
                intervals = IntervalsDorianScale;
            }
            else if (selectedMode.equals("Phrygian"))
            {
                intervals = IntervalsPhrygianScale;
            }
            else if (selectedMode.equals("Lydian"))
            {
                intervals = IntervalsLydianScale;
            }
            else if (selectedMode.equals("Mixolydian"))
            {
                intervals = IntervalsMixolydianScale;
            }
            else if (selectedMode.equals("Aeolian"))
            {
                intervals = IntervalsAeolianScale;
            }
            else if (selectedMode.equals("Locrian"))
            {
                intervals = IntervalsLocrianScale;
            }
            else
            {
                System.out.println("invalid choice");
                input.close();
                return;
            }
            System.out.println(rootNote + " " + selectedMode + " scale is:");
            for (int interval : intervals)
            {
                System.out.println(notes[currentNote]);
                currentNote = (currentNote + interval) % notes.length; //con l'operatore % posso rendere ciclico l'array di note cromatiche
            }
        
        
    }
        
        
}


/*
e|f|-|g|-|a|-|b|C|-|d|-|e|
B|C|-|d|-|e|f|-|g|-|a|-|b|
G|-|a|-|b|c|-|d|-|e|f|-|g|
D|-|e|f|-|g|-|a|-|b|C|-|d|
A|-|b|C|-|d|-|e|f|-|g|-|a|
E|f|-|g|-|a|-|b|C|-|d|-|e|
_____ *   *   *   *     :

*/

















































/*import java.util.Scanner;

public class calcolaModi {
            public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            //Array di stringhe contenente la scala cromatica
            String[] notes = {"C", "D#", "D", "Eb", "E", "F", "F#", "G","G#", "A", "Bb", "B"};
            //String[] modes = {"Ionian", "Dorian", "Phrygian", "Lydian", "Mixolydian", "Aeolian", "Locrian"};
            //String[] intervals = {"T-T-s-T-T-T-s ", "T-s-T-T-T-s-T", "s-T-T-T-s-T-T", "T-T-T-s-T-T-s", "T-T-s-T-T-s-T", "T-s-T-T-s-T-T", "s-T-T-s-T-T-T"};

            //Array numerici contenenti gli intervalli delle scale modali
            int[] IntervalsIonianScale = {2, 2, 1, 2, 2, 2, 1};
            int[] IntervalsDorianScale = {2, 1, 2, 2, 2, 1, 2};
            int[] IntervalsPhrygianScale = {1, 2, 2, 2, 1, 2, 2};
            int[] IntervalsLydianScale = {2, 2, 2, 1, 2, 2, 1};
            int[] IntervalsMixolydianScale = {2, 2, 1, 2, 2, 1, 2};
            int[] IntervalsAeolianScale = {2, 1, 2, 2, 1, 2, 2};
            int[] IntervalsLocrianScale = {1, 2, 2, 1, 2, 2, 2};

            //Richiedo all'utente un modo musicale
            System.out.println("Insert a music mode ");
            String selectedScale = input.nextLine().toLowerCase();
            System.out.println(selectedScale);

            //Selezione degli intervalli corrispondenti al modo inserita
            int[] Intervals;
            if (selectedScale.equals("Ionian"))
            {
                Intervals = IntervalsIonianScale;
            }
            if (selectedScale.equals("Dorian"))
            {
                Intervals = IntervalsDorianScale;
            }
            if (selectedScale.equals("Phrygian"))
            {
                Intervals =IntervalsPhrygianScale;
            }
            if (selectedScale.equals("Lydian"))
            {
                Intervals =IntervalsLydianScale;
            }
            if (selectedScale.equals("Mixolydian"))
            {
                Intervals =IntervalsMixolydianScale;

            }
            if (selectedScale.equals("Aeolian"))
            {
                Intervals =IntervalsAeolianScale;
            }
            }
            if (selectedScale.equals("Locrian"))
            {
                Intervals =IntervalsLocrianScale;
            }
            else
            {
                System.out.println("Scelta non è valida.");
                //scanner.close();
                return;
            }
                int currentNote = 0;
                for (int interval : Intervals)
                {
                    System.out.println(notes[currentNote]);
                    currentNote = (currentNote + interval);
                }
        }

} */









