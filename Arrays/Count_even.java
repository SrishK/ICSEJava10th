/*Write a program to count the even numbers in odd locations of an array of size 10*/
import java.util.*;
class Count_even
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int count=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            n[i]=sc.nextInt();
        }
        for(int j=0;j<10;j++)
        {
            if(j%2!=0 && n[j]%2==0)
            {
                count++;
            }
        }
       System.out.println("The number of even elements on odd indexes is- "+count);
    }
}