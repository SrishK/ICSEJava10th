/*Write a program to read store 10 numbers in an array A[] and 5 numbers in array B[]
Merge them into array C[]*/
import java.util.*;
class Merge
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        int B[]=new int[5];
        int C[]=new int[15];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            A[i]=sc.nextInt();
        }
         for(int i=0;i<5;i++)
        {
            System.out.println("Enter number");
            B[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            C[i]=A[i];
        }
        for(int i=0;i<5;i++)
        {
            C[i+10]=B[i];
        }
         for(int i=0;i<15;i++)
        {
            System.out.print(C[i]+" ");
        }
    }
}
        
            
        