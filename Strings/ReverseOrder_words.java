/*Display the words in reverse order as per e.g. Input ->Computer is fun Output ->fun is
Computer */
import java.util.*;
class ReverseOrder_words
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String s=sc.nextLine();
        s=" "+s;
        String str="";
        int l=s.length();
        int k=l;
        for(int i=l-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                for(int j=i+1;j<k;j++)
                {
                    str=str+s.charAt(j);
                }
                System.out.print(str+" ");
                str="";
                k=i;
            }
        }
    }
}