/*Check for Special number (Sum of factorials of each digit of a number is equal to the
number itself)*/
import java.util.*;
class Special
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int num=n,rem=0,fact=1,sum=0;
        while(n!=0)
        {
            fact=1;
            rem=n%10;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n/=10;
        }
        if(sum==num)
        {
            System.out.println("It is a special number");
        }
        else
        {
            System.out.println("It is not a special number");
        }
    }
}