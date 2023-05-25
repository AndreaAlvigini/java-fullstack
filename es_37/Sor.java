import java.util.ArrayList;
import java.util.Collections;

public class Sor
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Strawberry");

        Collections.sort(list);

        Collections.replaceAll(list, "Banana", "gatto") ;

        System.out.println("Sorted list: " +list);
        for (String  fruit : list)
        {
            System.out.println(fruit);
        }
    }
    
}
