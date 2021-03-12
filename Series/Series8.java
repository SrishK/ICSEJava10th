/*S = 2-4+6-8+………………………to N*/
import java.util.*;
class Series8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last number of series");
        int N=sc.nextInt();
        double S = 0;
        int check = 1;
        for(int i = 2; i<=N ; i +=2  )
        {
            if(check == 1)
                 S+= i;
            else
                 S-= i;
            check *= -1;
        }
        System.out.println(S);
    }
}