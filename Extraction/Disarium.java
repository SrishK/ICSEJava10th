import java.util.*;
class Disarium
{
    public static void main()
    {
        int rem,n,sum=0,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        n=sc.nextInt();
        int num=n,num2=n;
        while(n!=0)
        {
            rem=n%10;
            count++;
            n=n/10;
        }
        while(num!=0)
        {
            rem=num%10;
            sum+=Math.pow(rem,count--);
            num=num/10;
        }
        if(sum==num2)
        System.out.println("It is a disarium no.");
        else
        System.out.println("It is not a disarium no.");
    }
}