/*Display the characters of a String which are in upper case */
import java.util.*;
class Uppercase
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int ch=0,length=0;
        length=s.length();
        for(int i=0;i<length;i++)
        {
            ch=(int)s.charAt(i);
            if(ch>=65 && ch<=90)
            {
                System.out.println(s.charAt(i));
            }
        }
    }
}
        