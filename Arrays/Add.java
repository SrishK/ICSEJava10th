/*Write a program to read and store 10 numbers in an array .Add 2 to all even
numbers, add 3 to all odd numbers and display the new array*/
import java.util.*;
class Add
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
        System.out.println("New array is- ");
        for(int j=0;j<10;j++)
        {
            if(n[j]%2==0)
            {
            n[j]+=2;
            System.out.println(n[j]+" ");
        }
            else
            {
            n[j]+=3;
            System.out.println(n[j]+" ");
        }   
        }
    }
}
  