/*Read a sentence and insert a word at a location specified by the user.*/
import java.util.*;
class EnterWord
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        System.out.println("Enter word");
        String w=sc.next();
        System.out.println("Enter location");
        int n=sc.nextInt();
        int l=s.length();
        String str="";
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
                str=str+" ";
                if(c==n-1)
                {
                 str=str+w+" ";
                }
                
            }
        }
        System.out.println(str);
    }
}