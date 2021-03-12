/*Write a program to display maximum element in an array*/
import java.util.*;
class max_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            n[i]=sc.nextInt();
        }
        int max=0;
        for(int j=0;j<10;j++)
        {
            if(n[j]>max)
            {
                max=n[j];
            }
        }
        System.out.println("Maximum element in the array is "+max);
    }
}