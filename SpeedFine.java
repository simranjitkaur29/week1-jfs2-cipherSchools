package Basic;
import java.util.Scanner;
public class SpeedFine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your speed? : ");
        int speed=sc.nextInt();
        System.out.println("IS today your Birthday? : ");
        boolean b=sc.nextBoolean();
        if(b==true)
        {
            speed=speed-5;
        }
        if(speed>80)
        {
            System.out.println("High Ticket");
        }
        else if(speed>60&&speed<80)
        {
            System.out.println("Mid Ticket");
        }
        else
        {
            System.out.println("No ticket");
        }
    }
}
