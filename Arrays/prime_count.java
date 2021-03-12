/*Write a program to count number of prime numbers in an array of size 10*/
import java.util.*;
class prime_count
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int c=0,count=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number.");
            n[i]=sc.nextInt();
        }
        for(int j=0;j<10;j++)
        {
            for(int k=2;k<n[j];k++)
            {
                if(n[j]%k==0)
                {
                    c++;
                }
            }
            if (c==0)
            {
                count++;
            }
        }
        System.out.println("Number of prime numbers in the array is- "+count);
    }
}
                
            