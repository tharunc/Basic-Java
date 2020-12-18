class Exception{
    static int a[] = {10,11,21,31};
    static float d;
    static int i;
    public static void main(String args[]){
        try{
            System.out.println(a[10]+" ");
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("ArrayIndexOutOfBoundsException Occured");
        }
        try{
            d = 1/0;
        }catch(ArithmeticException s){
            System.out.println("Division by zero ");
        }
    }
}
