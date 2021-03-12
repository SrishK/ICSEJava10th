/*Write a function to check if the input number is a odd number and return Boolean
true or false accordingly*/
import java.util.*;
class Odd
{
   
    public static void main()
    {
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number.");
     int n=sc.nextInt();
     Odd f=new Odd();
     
     boolean r=f.testOdd(n);
     System.out.println(r);
     }
    public boolean testOdd(int num)
    {
        boolean b;
        if(num%2==0)
        {
            b=false;
        }
        else
        {
            b=true;
        }
        return b;
    }
}
        