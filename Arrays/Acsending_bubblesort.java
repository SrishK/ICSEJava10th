import java.util.*;
class Acsending_bubblesort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[15];
        for(int i=0;i<15;i++)
        {
            System.out.println("Enter number");
            n[i]=sc.nextInt();
        }
        int s=0;
        
        for(int i=0;i<15;i++)
        {
            for(int j=0;j<15-i-1;j++)
            {
                if(n[j]>n[j+1])
                {
                    s=n[j];
                    n[j]=n[j+1];
                    n[j+1]=s;
                }
            }
        }
        for(int k=0;k<15;k++)
        {
            System.out.print(n[k]+" ");
        }
    }
}
                    