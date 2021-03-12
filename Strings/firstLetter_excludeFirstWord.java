/*Display First alphabet of each word except the first word*/
import java.util.*;
class firstLetter_excludeFirstWord
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        String str="";
        int count=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                str=str+ch;
            }
            if(ch==' ')
            {
                count++;
                if(count==1)
                {
                    str="";
                    continue;
                }
                else
                {
                    System.out.println(str.charAt(0));
                }
                str="";
            }
        }
    }
}