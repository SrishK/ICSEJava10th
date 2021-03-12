/*Write a program to display first and last element of an array of size 10*/
import java.util.*;
class First_Last
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            nums[i]=sc.nextInt();
        }
        System.out.println("First element of the array is "+nums[0]+" and the last element is "+nums[9]);
    }
}
          