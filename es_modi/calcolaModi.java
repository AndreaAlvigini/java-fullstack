import java.util.Scanner;

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
            else if (selectedScale.equals("Dorian"))
            {
                Intervals = IntervalsDorianScale;
            }
            else if (selectedScale.equals("Phrygian"))
            {
                Intervals =IntervalsPhrygianScale;
            }
            else if (selectedScale.equals("Lydian"))
            {
                Intervals =IntervalsLydianScale;
            }
            else if (selectedScale.equals("Mixolydian"))
            {
                Intervals =IntervalsMixolydianScale;

            }
            else if (selectedScale.equals("Aeolian"))
            {
                Intervals =IntervalsAeolianScale;
            }
            }
            else if (selectedScale.equals("Locrian"))
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

}









