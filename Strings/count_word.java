/*Find the count of a particular word input by user in a sentence*/
import java.util.*;
class count_word
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        System.out.println("Enter word");
        String w=sc.next();
        s=s+" ";
        char ch=' ';
        int l=s.length();
        String str="";
        int c=0;
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                str=str+ch;
            }
            if(ch==' ')
            {
                if(w.equals(str))
                {
                    c++;
                }
                str="";
            }
        }
        System.out.println(c);
    }
}