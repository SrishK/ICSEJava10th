/*Remove the occurrences of duplicate characters in a String*/
import java.util.*;
class RemoveRepeat
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
            int l1=str.length();
            int count=0;
            char ch=s.charAt(i);
            if(ch!=' ')
            {
             for(int j=0;j<l1;j++)
             {
                if(ch==s.charAt(j))
                count++;
             }
             if(count==0)
             {
                str=str+s.charAt(i);
             }
            }
             if(ch==' ')
             {
             str=str+" ";
             }
            
        }
        System.out.println(str);
    }
}
        