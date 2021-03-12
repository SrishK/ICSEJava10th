/*Write a program to swap the first and last element of an array of size 10.*/
import java.util.*;
class swap_first_last
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number.");
            n[i]=sc.nextInt();
        }
        n[0]=n[0]+n[9];
        n[9]=n[0]-n[9];
        n[0]=n[0]-n[9];
        for(int j=0;j<10;j++)
        {
        System.out.println(n[j]);
    }
    }
}