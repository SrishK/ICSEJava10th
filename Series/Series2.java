/*S= 2/4 +4/6+6/8…………….. N terms */
import java.util.*;
class Series2
{
    public static void main()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of terms");
      int N=sc.nextInt();
      System.out.println("Enter x");
      int x=sc.nextInt();
      double S=0;
      for(int i=1;i<=N;i++)
      {
          S=S+Math.pow(x,i);
      }
      System.out.println(S);  
    }
}       