 public class genericMax
{

    public static <T extends Comparable<T>> T max(T... elements) // n argument syntax
// T is one class , Comparable another Class. Other T is return type. max is the function. Bracket is for n number of arguments
    {

        T max = elements[0]; //Considering first element as maximum

        for (T element : elements)  // For each loop.
            // T is class. element is object. : is syntax. elements is array set array name

        {

            if (element.compareTo(max) > 0)
            // compareTo is function, it returns if both values of integer zero. > 0, so it returns more than 1.

            {

                max = element;

            }

        }

        return max;

    }

    public static void main(String[] args)

    {

        System.out.println("Integer Max: " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89), Integer.valueOf(3), Integer.valueOf(456), Integer.valueOf(78), Integer.valueOf(45)));
        System.out.println("Double Max: " + max(Double.valueOf(5.6), Double.valueOf(7.8), Double.valueOf(2.9), Double.valueOf(18.6), Double.valueOf(10.25), Double.valueOf(18.6001)));

        System.out.println("String Max: " + max("Strawberry", "Mango", "Apple", "Pomegranate", "Guava", "Blackberry", "Cherry", "Orange", "Date"));
        System.out.println("Boolean Max: " + max(Boolean.TRUE, Boolean.FALSE)); System.out.println("Byte Max: " + max(Byte.MIN_VALUE, Byte.MAX_VALUE));
    }

}
