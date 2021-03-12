import java.util.*;
class Automorphic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int num=n,rem=0,count=0;
        int m=(int)Math.pow(n,2);
        while(n!=0)
        {
            rem=n%10;
            n/=10;
            count++;
        }
        if(m%Math.pow(10,count)==num)
        {
            System.out.println("It is an automorphic number");
        }
        else
        {
            System.out.println("It is not an automorphic number");
        }
    }
}