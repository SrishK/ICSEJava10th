/*S= 1*2 + 2*3 +3*4 ………… N terms*/
import java.util.*;
class Series3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int N=sc.nextInt();
        double S=0;
        int k=1,l=2;
        for(int i=1;i<=N;i++)
        {
            S=S+(k*l);
            k++;
            l++;
        }
        System.out.println(S);
    }
}