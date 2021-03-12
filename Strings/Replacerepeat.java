/*Replace the occurrences of duplicate characters in a String with a $. Input Rahul is a
student output ->Rahul is $ $t$den$*/
import java.util.*;
class Replacerepeat
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int l=s.length();
        String str="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            int c=0;
            int l1=str.length();
            if(ch!=' ')
            {
            for(int j=0;j<l1;j++)
            {
                if(ch==s.charAt(j))
                c++;
            }
            if(c==0)
            str=str+ch;
            else
            str=str+'$';
           }
           if(ch==' ')
           str=str+" ";
        }
        System.out.println(str);
        }
    }