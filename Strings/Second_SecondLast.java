/*Display the second and second last word of a sentence */
import java.util.*;
class Second_SecondLast
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String s=sc.nextLine();
        s=s+" ";
        String str="";
        int l=s.length();
        int c=0,count=0;
        for(int i=0;i<l;i++)
        {
          char a=' ';
          a=s.charAt(i);
          if((int)a==32)
          {
              count++;
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
                c++;
             if(c==2)
             {
                System.out.println("Second word is "+str);
                str="";
             }
             else if(c==count-1)
             {
                System.out.println("Second last word is "+str);
                str="";
              }
              else
              str="";
            }
        }
    }
}
