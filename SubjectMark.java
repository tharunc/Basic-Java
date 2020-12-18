// 
// 25.	Develop the Internal mark calculation system based on the attendance percentage using Java. Get the student name, register number, total number of working days in the semester and Number of days present. Calculate attendance percentage of the students and award attendance mark based on the following condition. 
// i.	Attendance percentage >=90 – 5 Marks
// ii.	Attendance percentage >=80 and < 90 – 4 Marks
// iii.	Attendance percentage >=75 and < 80 – 3 Marks



import java.util.Scanner;

public class SubjectMark{
    public static void main(String[] args) {
        Obj s = new Obj();
        s.GetName();
        s.getSubjects();
        s.GetMarks();
        s.Calc();




    }
}

class Obj {

    String name, name1, name2, name3, name4;
    int marks1, marks2, marks3, marks4, marks5, total;
    double avg;
    String Subject1, Subject2, Subject3, Subject4, Subject5;

    Obj()
    {
        String name="",name1="", name2="", name3="", name4="";
        int marks1=0, marks2=0, marks3=0, marks4=0, marks5=0, total=0;
        double avg=0;
        String Subject1="", Subject2="", Subject3="", Subject4="", Subject5="";

    }
    void GetName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name of Student 1 :");
        name = s.nextLine();
        System.out.println("Enter the Name of Student 2 :");
        name1 = s.nextLine();
        System.out.println("Enter the Name of Student 3 :");
        name2 = s.nextLine();
        System.out.println("Enter the Name of Student 4 :");
        name3 = s.nextLine();
        System.out.println("Enter the Name of Student 5 :");
        name4 = s.nextLine();


    }

    void GetMarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of Student 1 :");
        marks1 = s.nextInt();
        System.out.println("Enter the marks of Student 2 :");
        marks2 = s.nextInt();
        System.out.println("Enter the marks of Student 3 :");
        marks3 = s.nextInt();
        System.out.println("Enter the marks of Student 4 :");
        marks4 = s.nextInt();
        System.out.println("Enter the marks of Student 5 :");
        marks5 = s.nextInt();

    }

    void getSubjects(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name of Subject 1 :");
        Subject1 = s.nextLine();
        System.out.println("Enter the Name of Subject 2 :");
        Subject2 = s.nextLine();
        System.out.println("Enter the Name of Subject 2 :");
        Subject3 = s.nextLine();
        System.out.println("Enter the Name of Subject 4 :");
        Subject4 = s.nextLine();
        System.out.println("Enter the Name of Subject 5 :");
        Subject5 = s.nextLine();

    }

    void Calc(){
        total = marks1 + marks2 + marks3 + marks4 + marks5;
        avg = total / 5;

        System.out.println("Your Total and Average is : " + total +" "+ avg  );
    }
}

