package Basic;
import java.util.Scanner;

public class EmployeePayRoll
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("What is your basic Pay: ");
       double num=sc.nextInt();
      
       
       Double hra,dp,gp;
       if(num>=5000)
       {
        hra=0.1*num;
        dp=num*0.2;
        
       }
       else
       {
       hra=0.2*num;
       dp=0.3*num;

       }
       gp=hra+dp;
       System.out.println("Hra: "+hra+"Dp : "+dp);
       System.out.println("Gross pay: "+gp);
       
    }

}