/*Check if input string is a valid identifier */
import java.util.*;
class ValidIdentifier
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.next();
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            int n=ch;
            if(n>=65 && n<=90 || n>=97 && n<=122 ||ch=='_' || ch=='$' || ch<='9' && ch>='0')
            {
                continue;
            }
            else
            c++;
        }
        if(c!=0)
        System.out.println("Not a valid identifier");
        else
        System.out.println("Valid identifier");
    }
}