/*Design A Class amicable (int,int) with a default constructor, a parameterized
constructor and the following two functions :
a. checkAmicable(int,int) – this function returns true if the two arguments are amicable
otherwise it returns false.
b. main(int,int) – this function invokes the above function and prints whether the
parameters passed to it are amicable or not. */
import java.util.*;
class Amicable
{
    static int x,y;
    public Amicable()
    {
        x=0;
        y=0;
    }

    public Amicable(int x1,int y1)
    {
        x=x1;
        y=y1;
    }

    public boolean checkAmicable(int x2,int y2)
    {
        int sum=0;
        boolean b1;
        for(int i=1;i<x2;i++)
        {
            if(x2%i==0)
            {
                sum+=i;
            }
        }
        if(sum==y2)
        {
            b1=true;
        }
        else
    {
            b1=false;
        }
        return b1;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 nos.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Amicable obj=new Amicable();
        Amicable obj2=new Amicable(a,b);
        Amicable obj3=new Amicable();
        boolean boo=obj2.checkAmicable(x,y);
        System.out.println(a+" and "+b+" are amicable-"+boo);
    }
}