/*S = 1+1+2+3+5+………………..to N terms */
import java.util.*;
class Series7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int N=sc.nextInt();
        double S=0;
        int n1=1,n2=1,n3=0;
        for(int i = 1 ; i <=N ; i++ )
        {
            S=S+(n1 + n2);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(S);
    }
}