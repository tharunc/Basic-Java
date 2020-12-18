// Develop a Java application using packages to implement the following currency converter – Dollar to Indian Rupees, Euro to Indian Rupees, and vice versa.


import java.util.Scanner;

public class CurrencyINR{
    public static void main(String[] args) {
        obj s = new obj();
        s.getData();

    }
}

class obj1{
    double INR;
    double USD;
    double EURO;
    int type;



    obj1(){
        this.INR = 0;
        this.USD = 0;
        this.EURO = 0;
        this.type = 0;

    }
    void getdata(){
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE TYPE OF CONVERSION : \n 1.INR-USD\n 2.INR-EURO\n 3.USD-INR\n 4. EURO-INR");
        int type=s.nextInt();

        switch (type) {
            case 1:
                System.out.println("Your Value in INR : ");
                double INR = s.nextDouble();
                USD = INR / 74;
                System.out.println(USD + " " + "$");
                break;
        }
        switch (type){

            case 2:
                System.out.println("Your Value in INR : ");
                double INR = s.nextDouble();
                EURO = INR / 89;
                System.out.println(EURO + " " + "€");
                break;


        }
        switch (type){

            case 3:
                System.out.println("Your Value in USD : ");
                double INR = s.nextDouble();
                INR = INR * 74.0;
                System.out.println(INR + " " + "₹");
                break;


        }
        switch (type){

            case 4:
                System.out.println("Your Value in EURO : ");
                double INR = s.nextDouble();
                INR = INR * 89;
                System.out.println(INR + " " + "₹");
                break;


        }

    }
}

