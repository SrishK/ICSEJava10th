/*Read a double digit number and display the same in word.*/
import java.util.*;
class TwoDigit_name
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String a[]={"one","two","three","four","five","six","seven","eight","nine"};
        String b[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String c[]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        System.out.println("Enter 2-digit number");
        int n=sc.nextInt();
        int ld=n%10;
        int od=n/10;
        System.out.print(n+" in words is ");
        if(od==1)
        {
          for(int i=0;i<10;i++)
          {
              if(ld==i)
              {
                  System.out.println(b[i]);
                }
            }
        }
        else
        {
            for(int j=0;j<10;j++)
            {
                if(od-2==j)
                {
                    System.out.print(c[j]+"-");
                }
            }
            for(int k=0;k<10;k++)
            {
                if(ld-1==k)
                {
                    System.out.print(a[k]);
                }
            }
        }
      }
}
              