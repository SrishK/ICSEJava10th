/*Display the longest word of a sentence*/
import java.util.*;
class LongestWord
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        String str="",longest="";
        int l1=0,l2=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                str=str+ch;
            }
            if(ch==' ')
            {
               l1=str.length();
               l2=longest.length();
               if(l1>l2)
               longest=str;
               str="";
            }
            
        }
        System.out.println(longest);
    }
}