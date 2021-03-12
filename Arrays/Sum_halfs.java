/*Write a program to read and store 20 numbers in an array .Find the sum of first 10
and last 10 elements. Display which half has bigger sum.*/
import java.util.*;
class Sum_halfs
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[20];
        int sum1=0,sum2=0;
        for(int i=0;i<20;i++)
        {
            System.out.println("Enter number");
            n[i]=sc.nextInt();
        }
        for(int j=0;j<10;j++)
        {
            sum1+=n[j];
        }
        for(int k=10;k<20;k++)
        {
            sum2+=n[k];
        }
        if(sum1>sum2)
        System.out.println("Sum of first half is greater than sum of second part");
        else
        System.out.println("Sum of second half is greater than sum of first part");
    }
}
            
        