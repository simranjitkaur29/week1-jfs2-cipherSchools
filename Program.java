import java.util.Scanner;

import Basic.Switch;

abstract  class Doctor {
    abstract void treatPatient();
}
 class Physician extends Doctor
{
     void treatPatient()
    {
        System.out.println("Hi! i am Physician\n I treat patients using medicines.");

    }
}

class Surgeon extends Doctor
{
    void treatPatient()
    {
        System.out.println("Hi! I am Surgeon \n I treat patients using Surgery!");
    }
}

class Dentist extends Doctor
{
    void treatPatient()
    {
        System.out.println("Hi! I am dentist \n I treat patients Teeth");
    }
}
public class Program 
{
    public static void main(String[] args) {
        System.out.println("Hi! I am Lucy! Receptionist at Max Care");
        System.out.println("Who you are looking for ? ");
        System.out.println("Press 1 for Physician \n Press 2 for Surgeon \n Press 3 for Dentist ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Doctor doc=null;
        switch(num)
        {
            case 1:
            doc= new Physician();
            break;

            case 2:
            doc=new Surgeon();
            break;

            case 3:
            doc=new Dentist();
            break;
            
            default:
            System.out.println("You choose Invalid number ");
            break;
        }
        if(num<=0||num>3)
        {
            System.exit(num);
            
        }
        else
        {
            doc.treatPatient();
        }

    }

}