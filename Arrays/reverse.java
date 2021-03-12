/*Write a program to read and store 10 numbers in an array and reverse the content of
the array without using a temporary array */
import java.util.*;
class reverse
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
     for(int j=0,k=9;k>=5;j++,k--)
        {
            if(j!=k)
            {
                n[j]=n[j]+n[k];
                n[k]=n[j]-n[k];
                n[j]=n[j]-n[k];
                
            }
    }
    for(int l=0;l<10;l++)
    {
        System.out.print(n[l]+" ");
    }
  }
}
    