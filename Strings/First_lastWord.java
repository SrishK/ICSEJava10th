import java.util.*;
class First_lastWord
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        String str="";
        int c=0,c1=0;
        for(int i=0;i<l;i++)
        {
          char ch=s.charAt(i);
          if(ch==' ')
          {
              c++;
          }
        }
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                str=str+ch;
            }
            if(ch==' ')
            {
                c1++;
                if(c1==1 || c1==c)
                {
                    System.out.println(str);
                }
                str="";
            }
        }
    }
}