//Develop a java application with Employee class with Emp_name, Emp_id, Address, Mail_id, Mobile_no as members, Inheric the classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class. Add Basic pay as the member of
//all the inherited classes with 97% of Basic Pay as DA, 10% of Basic Pay as HRA, 12 % Basic Pay as PF, 0.1% of Basic Pay for staff club fund. Generate pay slips for the employees with their gross and net salary.


import java.util.Scanner;
class employee
{

    String name; int id;
    String address; String mail; String mobile;
    float da,hra,pf,scf,gross,net; float b;
    void getdata()

    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter id");
        id=sc.nextInt();
        System.out.println("Enter the address");
        address=sc.next();
        System.out.println("Enter mail");
        mail=sc.next();

        System.out.println("Enter mobile"); mobile=sc.next();
    }

    void calc(float basic)

    {

        b=basic; da=(float)(basic*97/100);
        hra=(float)(basic*10/100);
        pf=(float)(basic*12/100);
        scf=(float)(basic*0.1/100);
        gross=basic+da+hra+pf+scf;
        net=gross-pf;
    }

    void display()

    {

        System.out.println("***************Employee details***************");
        System.out.println("Employee Name = "+name);
        System.out.println("Employee ID = "+id);
        System.out.println("Employee address = "+address);
        System.out.println("Employee mobile number = "+mobile);
        System.out.println("Employee Mail ID = "+mail);
        System.out.println("Basic pay = "+b);
        System.out.println("DA = "+da);
        System.out.println("HRA = "+hra);
        System.out.println("PF = "+pf);
        System.out.println("Staff Club Fund = "+scf);
        System.out.println("Gross Salary = "+gross);
        System.out.println("Net Salary = "+net);

    }

}

class programmer extends employee

{

    float bp; programmer()
{ bp=2500;
}

}

class ap extends employee

        {

        float bp; ap()
        { bp=5000;
        }

        }

        class asso extends employee

        {

        float bp; asso()
        { bp=7500;
        }

        }

class prof extends employee

{

    float bp; prof()
{ bp=10000;
}

}

class emp

{

    public static void main(String args[])

    {

        int choice;

        Scanner sc=new Scanner(System.in);

        System.out.println("1.PROGRAMMER\n2.ASSISTANT PROFESSOR\n3.ASSOCIATE PROFESSOR\n4.PROFESSOR");
        System.out.println("Enter the choice"); choice=sc.nextInt();
        switch(choice)

        {

            case 1:

                System.out.println("Enter the programmer details"); programmer ob1=new programmer(); ob1.getdata();
                ob1.calc(ob1.bp); ob1.display(); break;
            case 2:
                System.out.println("Enter the Assistant Professor details"); ap ob2=new ap();
                ob2.getdata();

                ob2.calc(ob2.bp); ob2.display(); break;
            case 3:

                System.out.println("Enter the Associate Professor details"); asso ob3=new asso();
                ob3.getdata(); ob3.calc(ob3.bp); ob3.display(); break;
            case 4:
                System.out.println("Enter the Professor details"); prof ob4=new prof();
                ob4.getdata(); ob4.calc(ob4.bp); ob4.display(); break;
        }

    }

}
