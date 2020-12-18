import java.util.ArrayList;
import java.util.Collections;     //INSERTION
import java.util.List;
import java.util.Scanner;
    public class ArrSt
    {
        public static void main(String args[])
    {
        List<String>listStrings = new ArrayList<String>();
        List<String>NewString= new ArrayList<String>();

        Scanner s=new Scanner(System.in);
//Insert the elements to the ArrayList
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        listStrings.add("Four");
        listStrings.add(0,"Nine");
        listStrings.add("Five");
        listStrings.add("Six");
        listStrings.add("Seven");
        listStrings.add("Eight");
        System.out.println("The list of elements in the ArrayList:\n"+listStrings);


        String[] items = new String[]{"Hello", "World"};
        Collections.addAll(listStrings, items);
        System.out.println("The list of elements in the ArrayList after adding at end:\n"+listStrings);

 String s1;
        System.out.println("Enter the element to search"); s1=s.nextLine();
        if (listStrings.contains(s1))
        {
            System.out.println("Found the element\n");
        }

        else
        {
            System.out.println("There is no such element\n");
        }
        String Letter;
        System.out.println("Enter the letter to check"); Letter=s.nextLine();
        for(int i=0;i<listStrings.size();i++)
        {
            if(listStrings.get(i).startsWith(Letter.toUpperCase()))
            {
                NewString.add(listStrings.get(i));
            }
        }
        System.out.println("The list of elements starts with the given letter\n"+NewString);
    }
}

