/*Write a program to display count of even and odd numbers in an array*/
import java.util.*;
class Even_odd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int nums[]= new int[20];
        int count_e=0;
        int count_o=0;
        for(int i=0;i<20;i++)
        {
            System.out.println("Enter number.");
            nums[i]=sc.nextInt();
            if(nums[i]%2==0)
            {
                count_e+=1;
            }
            else
            {
                count_o+=1;
            }
        }
        System.out.println("Count of even numbers in the array is "+count_e+" and the count of odd numbers in the array is "+count_o);
    }
}
        