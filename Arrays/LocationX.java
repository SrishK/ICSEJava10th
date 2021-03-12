/*Write a program to read and store 10 numbers in an array and display the maximum
element after the location x specified by the user */
import java.util.*;
class LocationX
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
        System.out.println("Enter x");
        int x=sc.nextInt();
        int max=0;
        for(int j=x+1;j<10;j++)
        {
            if(max<num[j])
            max=num[j];
        }
        System.out.println("Maximum number from location "+x+" is "+max);
    }
}