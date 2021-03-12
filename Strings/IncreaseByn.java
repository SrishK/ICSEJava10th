/*. Encrypt the String with number n specified by the user. Input ->Ram Encryption ->3
Output ->Udp*/
import java.util.*;
class IncreaseByn
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        s=s+" ";
        System.out.println("Enter n");
        int n=sc.nextInt();
        int l=s.length();
        String str="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                int n1=ch+n;
                if(Character.isUpperCase(ch)==true)
                {
                  if(n1>90)
                  {
                   int d=n1-90;
                   n1=64+d;
                   str=str+(char)n1;
                  }
                  else
                  str=str+(char)n1;
                }
                if(Character.isLowerCase(ch)==true)
                {
                 if(n1>122)
                 {
                  int d1=n1-122;
                  n1=96+d1;
                  str=str+(char)n1;
                 }
                 else
                 str=str+(char)n1;
                }
            }
                if(ch==' ')
                {
                  str=str+" ";
                }
            
        }
        System.out.print(str);
    }
}