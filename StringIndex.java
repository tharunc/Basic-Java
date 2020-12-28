//	Write a Java program for handling the following exception
//  StringIndexOutOfBound Exception


class StringIndex
{
    public static void main(String args[])
    {
        try{
            String str="beginnersbook";
            System.out.println(str.length());;
            char c;
            c = str.charAt(40);
            System.out.println(c);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException!!");
        }
    }
}

// If you try to access the Index of the String, which is greater than the String itself, StringIndexOutOfBoundsException is thrown.
