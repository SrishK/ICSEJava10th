/*Read a number between 1 to 50 and display the Roman value for the same*/
import java.util.*;
class Roman_numerals
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s[]={"I","II","III","IV","V","VI","VII","VIII","IX","X","L"};
        System.out.println("Enter number between 1 and 50");
        int n=sc.nextInt();
        if(n>=1 && n<=50)
        { 
        int c=n/10;
        int ld=n%10;
        System.out.print(n+" in roman numerals is ");
        for(int j=1;j<=c;j++)
        {
            if(c!=5)
            System.out.print(s[9]);
        }
        if(c==5)
        System.out.println(s[10]);
        for(int i=0;i<9;i++)
        {
            if(ld-1==i)
            {
            System.out.print(s[i]);
            break;
            }
        }
   }
   else
   System.out.println("Invalid number");
 }
}
   

        