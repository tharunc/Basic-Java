public class genericMin{

    public static <T extends Comparable<T>> T min(T... elements){

        T min = elements[0];

        for (T element: elements) {

            if(element.compareTo(min) < 0){

                min = element;

            }

        }

        return min;
    }

    public static void main(String[] args)

    {

        System.out.println("Integer Min: " + min(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89), Integer.valueOf(3), Integer.valueOf(456), Integer.valueOf(78), Integer.valueOf(45)));
        System.out.println("Double Min: " + min(Double.valueOf(5.6), Double.valueOf(7.8), Double.valueOf(2.9), Double.valueOf(18.6), Double.valueOf(10.25), Double.valueOf(18.6001)));

        System.out.println("String Min: " + min("Strawberry", "Mango", "Apple", "Pomegranate", "Guava", "Blackberry", "Cherry", "Orange", "Date"));
        System.out.println("Boolean Min: " + min(Boolean.TRUE, Boolean.FALSE)); System.out.println("Byte Min: " + min(Byte.MIN_VALUE, Byte.MIN_VALUE));
    }

}

