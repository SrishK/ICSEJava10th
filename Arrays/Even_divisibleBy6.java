/*Write a program to read and store 10 numbers in an array and display the numbers
which are even and multiples of 6*/
import java.util.*;
class Even_divisibleBy6
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
        for(int j=0;j<10;j++)
        {
            if(num[j]%2==0 && num[j]%6==0)
            {
                System.out.println(num[j]);
            }
            else
            {
                System.out.println(num[j]+"is either not an even number or it is not a multiple of 6.");
            }
        }
    }
}