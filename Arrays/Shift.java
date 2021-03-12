/*Write a program to store 10 numbers in an array and shift all even numbers to array
e[] and all odd numbers to array o[].*/
import java.util.*;
class Shift
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int count_e=0,count_o=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            n[i]=sc.nextInt();
            if(n[i]%2==0)
            count_e++;
            else
            count_o++;
        }
        int e[]=new int[count_e];
        int o[]=new int[count_o];
        int k=0,j=0;
        for(int i=0;i<10;i++)
        {
            if(n[i]%2==0)
            {
            e[k]=n[i];
            k++;
        }
            else
            {
            o[j]=n[i];
            j++;
        }
        }
        for(int i=0;i<count_e;i++)
        {
            System.out.print(e[i]+" ");
        }
        for(int i=0;i<count_o;i++)
        {
            System.out.print(o[i]+" ");
        }
    }
}
    