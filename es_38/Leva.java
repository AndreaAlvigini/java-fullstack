import java.util.ArrayList;

public class Leva
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Strawberry");

        list.remove("Grapes");
        list.remove(1);
        
        

        System.out.println("List: " +list);
        for (String  fruit : list)
        {
            System.out.print(fruit);
            System.out.println(list.indexOf(fruit));
        }
        

    }
}