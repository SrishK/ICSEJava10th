/*Read a String. Swap the characters at location x and y specified by user*/
import java.util.*;
class swap_char
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int x=0,y=0;
        String str="";
        System.out.println("Enter location X and Y");
        x=sc.nextInt();
        y=sc.nextInt();
        int length=(s.length())-1;
        char ch=' ',c1=s.charAt(x),c2=s.charAt(y);
        ch=c1;
        for(int i=0;i<=length;i++)
        {
          if(i==x)
          {
              str=str+s.charAt(y);
            }
            else if(i==y)
          {
              str=str+c1;
            }
            else
            {
              str=str+s.charAt(i);
            }
        }
        System.out.println(str);
        
    }
}