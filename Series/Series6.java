/*S= x^2/2! + x^4/4! + x^6/6! …………… N terms*/
import java.util.*;
class Series6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int N=sc.nextInt();
        System.out.println("Enter x");
        int x=sc.nextInt();
        double S=0,l=0;
        int k=2,fact=1;
        for(int i=1;i<=N;i++)
        {
            fact=1;
            for(int j=1;j<=k;j++)
            {
                fact=fact*j;
            }
            l=Math.pow(x,k)/fact;
            S=S+l;
            k+=2;
        }
        System.out.println(S);
    }
}