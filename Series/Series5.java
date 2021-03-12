/*S= (10*1) /3 + (20*3)/5 + (30*5)/7………… N terms*/
import java.util.*;
class Series5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int N=sc.nextInt();
        double S=0,n=0;
        int k=10,l=1,m=3;
        for(int i=1;i<=N;i++)
        {
            n=(k*l)/m;
            S=S+n;
            k*=2;
            l+=2;
            m+=2;
        }
        System.out.println(S);
    }
}