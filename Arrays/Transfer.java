/*Write a program to read store 10 numbers in an array A[]and put the first 5 in array
B[] and next 5 in array C[]. Display the content of new arrays.*/
import java.util.*;
class Transfer
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        int B[]=new int[5];
        int C[]=new int[5];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            A[i]=sc.nextInt();
        }
        for(int j=0;j<5;j++)
        {
            B[j]=A[j];
        }
        for(int k=0;k<5;k++)
        {
            C[k]=A[k+5];
        }
        for(int k=0;k<5;k++)
        {
            System.out.print(B[k]);
        }
        System.out.print(" ");
         for(int k=0;k<5;k++)
        {
            System.out.print(C[k]);
        }
    }
}
            