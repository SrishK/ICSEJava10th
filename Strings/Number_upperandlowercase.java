/*Count no of lower case and uppercase characters in a String */
import java.util.*;
class Number_upperandlowercase
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int length=0,ch=0,c_u=0,c_l=0;
        length=s.length();
        for(int i=0;i<length;i++)
        {
            ch=(int)s.charAt(i);
            if(ch>=65 && ch<=90)
            c_u++;
            if(ch>=97 && ch<=122)
            c_l++;
        }
        System.out.println("Number of lower case characters is "+c_l);
        System.out.println("Number of upper case characters is "+c_u);
    }
}         