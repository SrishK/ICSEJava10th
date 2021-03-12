import java.util.*;
class First_lastChar
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        String str="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                str=str+ch;
            }
            if(ch==' ')
            {
                int l1=str.length();
                System.out.println("First character is- "+str.charAt(0));
                System.out.println("Last character is- "+str.charAt(l1-1));
                str="";
                l1=0;
            }
        }
    }
}