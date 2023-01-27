package Basic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your division : ");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("You got first rank");
                break;
            }
            case 2:
            {
                System.out.println("You got second rank");
                break;
            }
            case 3:
            {
                System.out.println("You got third rank");
                break;
            }
            default:
            {
                System.out.println("Not a rank");
                break;
            }
        }
    }
}
