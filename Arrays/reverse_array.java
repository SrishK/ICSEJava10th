/*Write a program to read and store 10 numbers in an array and display the array in
reverse order*/
import java.util.*;
class reverse_array
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
        for(int j=9;j>=0;j--)
        {
            System.out.print(n[j]);
        }
    }
}