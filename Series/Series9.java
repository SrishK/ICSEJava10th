/*S = a - a3/5 + a5/9 – a7/13 …………………..to N terms */
import java.util.*;
class Series9
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int N=sc.nextInt();
        System.out.println("Input value of a: ");
        int a = sc.nextInt();
        double S=0;
        double term = a;
        double k = 1;
        for(int i = 1; i <=N ; i++ )
        {
            if(i%2 != 0)
                S+= term/k;
            else
                S-= term/k;
            term = term + a + a;
            k += 4;    
        }
        System.out.println(S);
    }
}