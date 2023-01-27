package Basic;
import java.util.Scanner;

public class BurpLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How long your burp is : ");
        int n=sc.nextInt();
        String msg="";
        for(int i=0;i<n;i++)
        {
            msg+="r";

        }
        System.out.println("Bu"+msg+"p");

       }
}
