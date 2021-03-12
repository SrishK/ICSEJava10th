/*S= 2+4+6+8…. N terms*/
import java.util.*;
class Series1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int N=sc.nextInt();
        double S=0;
        int k=2;
        for(int i=1;i<=N;i++)
        {
            S=S+k;
            k+=2;
        }
        System.out.println(S);
    }
}   