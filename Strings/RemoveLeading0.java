/*Remove leading zeroes from a String*/
import java.util.*;
class RemoveLeading0
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.next();
        int l=s.length();
        String str="";
        int i=0;
        for(i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c=='0')
            {
                str=str+"";
            }
            else
            {
                break;
            }
        }
        for(int j=i;j<l;j++)
        {
            str=str+s.charAt(j);
        }
        System.out.println(str);
    }
}