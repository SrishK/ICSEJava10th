/*Remove occurrences of multiple consecutive blank spaces from a String*/
import java.util.*;
class RemoveConsecutiveSpaces
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int l=s.length();
        String str="";
        int c=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                c++;
                if(c==1)
                str=str+" ";
                else
                str=str+"";
            }
            if(ch!=' ')
            {
                c=0;
                str=str+ch;
            }
        }
        System.out.println(str);
    }
}