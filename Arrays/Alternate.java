/*Write a program to read and store 10 numbers in an array and display the product of
alternate elements of the array*/
import java.util.*;
class Alternate
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int p=0,p1=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            n[i]=sc.nextInt();
        }
        for(int j=0,k=2;k<10;k+=1,j+=1)
        {
            p=n[j]*n[k];
            System.out.println(p);
        }
    }
}
        
            