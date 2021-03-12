/*Write a program to read and store 20 numbers in an array and find out the largest
even no and smallest odd number*/
import java.util.*;
class LargestEven_SmallestOdd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[20];
        for(int i=0;i<20;i++)
        {
            System.out.println("Enter number");
            n[i]=sc.nextInt();
        }
        int max=0;
        for(int j=0;j<20;j++)
        {
            if(max<n[j])
            {
                max=n[j];
            }
        }
        int max_even=0;
        for(int k=0;k<20;k++)
        {
            if(n[k]%2==0 && max_even<n[k])
            {
                max_even=n[k];
            }
        }
        int min=max;
        for(int l=0;l<20;l++)
        {
            if(n[l]%2!=0 && min>n[l])
            {
                min=n[l];
            }
        }
        System.out.println("Maximum even number is- "+max_even);
        System.out.println("Smallest odd number is- "+min);
    }
}
    
        
        
            