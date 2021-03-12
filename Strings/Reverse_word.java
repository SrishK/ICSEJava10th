/*Display the reverse of each word of a sentence Input-> who are you output ->ohw era
uoy*/
import java.util.*;
class Reverse_word
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String str=sc.nextLine();
        str=str+" ";
        int l=str.length();
        String s="";
        String r="";
        int lw=0;
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                s=s+ch;
            }
            if(ch==' ')
            {
                lw=s.length();
                for(int j=lw-1;j>=0;j--)
                {
                    char c=s.charAt(j);
                    r=r+c;
                }
                System.out.print(r+" ");
                r="";
                s="";
            }
        }
    }
}
                    