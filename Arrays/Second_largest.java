/*Display the second largest element in an array without sorting the array*/
import java.util.*;
class Second_largest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int index=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            n[i]=sc.nextInt();
        }
        int max=0;
        for(int j=0;j<10;j++)
        {
            if(max<n[j])
            {
            max=n[j];
            index=j;
        }
        }
        int large2=0;
        for(int k=0;k<10;k++)
        {
            if(k!=index && n[k]>large2)
            {
                large2=n[k];
            }
        }
        System.out.println("Second largest number is "+large2);
    }
}
            
        