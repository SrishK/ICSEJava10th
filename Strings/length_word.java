/*Display the length of each word of a sentence*/
import java.util.*;
class length_word
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String str=sc.nextLine();
        str=str+" ";
        String s="";
        int l=str.length();
        int l_word=0;
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                s=s+ch;
            }
            if(ch==' ')
            {
               l_word=s.length();
               System.out.println("Length of "+s+" is "+l_word);
               l_word=0;
               s="";
            }
        }
    }
}