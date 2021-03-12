/*Reverse the case of each character of a String i.e. convert lower case alphabets to
uppercase and vice versa*/
import java.util.*;
class Reverse_case
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int l=s.length();
        String str="";
        char ch=' ';
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch)==true)
            {
                str=str+(Character.toLowerCase(ch));
            }
            if(Character.isLowerCase(ch)==true)
            {
                str=str+(Character.toUpperCase(ch));
            }
        }
        System.out.println(str);
    }
}