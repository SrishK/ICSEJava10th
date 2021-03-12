/*Write a program to read and store 10 numbers in an array and display the maximum
and minimum element in the same*/
import java.util.*;
class Max_min
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            num[i]=sc.nextInt();
        }
        int max=0;
        for(int j=0;j<10;j++)
        {
            if(num[j]>max)
            {
                max=num[j];
            }
        }
        int min=max;
        for(int k=0;k<10;k++)
        {
            if(num[k]<min)
            {
                min=num[k];
            }
        }
        System.out.println("Maximum number is "+max+" and minimum number is "+min);
    }
}