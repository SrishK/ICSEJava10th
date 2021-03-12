import java.util.*;
class Armstrong
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int num=n,rem=0,a=0;
        while(n!=0)
        {
            rem=n%10;
            a=a+(int)Math.pow(rem,3);
            n=n/10;
        }
        if(a==num)
        {
            System.out.println("It is an armstrong number");
        }
        else
        {
            System.out.println("It is not an armstrong number");
        }
    }
}