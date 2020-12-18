// Internal mark calculation system based on the attendance percentage using Java. Get the student name, register number, total number of working days in the semester and Number of days present. Calculate attendance percentage of the students and award attendance mark based on the following condition. 
// i.	Attendance percentage >=90 – 5 Marks
// ii.	Attendance percentage >=80 and < 90 – 4 Marks
// iii.	Attendance percentage >=75 and < 80 – 3 Marks


import java.util.Scanner;

public class InternalMark {
    public static void main(String[] args) {
        obj s = new obj();
        s.getData();
        s.calc();
        s.printData();
        s.result();


    }
}

class obj{
    String name;
    int reg,Grade;
    double days;
    double Present;
    double percentage;
    obj()     // Constructor
    {
        this.name="";
        this.Grade = 0;
        this.reg=0;
        this.days=0;
        this.Present=0;
        this.percentage=0;
    }
    void getData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        name=s.nextLine();
        System.out.println("Enter Your Reg. No: ");
        reg=s.nextInt();
        System.out.println("Enter Total Semester Working Days: ");
        days=s.nextInt();
        System.out.println("Enter Your Present Working days: ");
        Present=s.nextInt();

    }
    void printData(){
        System.out.println("Your Name : "+ name+"\n");
        System.out.println("Your Reg. NO. : " + reg + "\n");
        System.out.println("Total Semester Working Days :" + days + "\n");
        System.out.println("Total No. Days Present :" + Present + "\n");

        System.out.println("Total percentage :" + percentage + "\n");



    }


    void calc()
    {
        percentage = (Present / days) * 100;
        if (percentage >= 90){
            Grade = 5;
        }
        if(percentage>= 80  && percentage< 90 ){

            Grade = 4;

        }
        if (percentage>=75 && percentage< 80){
            Grade = 3;
        }
    }
    void result()
    {
        System.out.println("\nYour Attendance Marks : " + Grade);
    }
    }
