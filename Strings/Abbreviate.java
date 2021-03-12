/*Abbreviate the name as below
 Input ->Mohan Babu Ramarao
 Output ->M.B.Ramarao*/
import java.util.*;
class Abbreviate
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        String str="",finalstr="";
        int count=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
             count++;
            }
        }
        int c=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                str=str+ch;
            }
            if(ch==' ')
            {
                c++;
                if(c<count)
                {
                 finalstr=finalstr+str.charAt(0)+".";
                }
                if(c==count)
                {
                 finalstr=finalstr+str;
                }
                str="";
            }
        }
        System.out.println(finalstr);
    }
}
                