/* Write a program to store first 20 terms of a Fibonacci series in an array*/
import java.util.*;
class Fibonacci
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int f[]=new int[20];
        int n=20,t2=1,t1=0;
        f[0]=0;
        f[1]=1;
        for(int i=2;i<20;i++)
        {
            f[i]=t1+t2;
            t1=t2;
            t2=f[i];
        }
        for(int k=0;k<20;k++)
        {
            System.out.print(f[k]+" ");
    }
    }
}