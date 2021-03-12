/*Display the string in Reverse Order*/
import java.util.*;
class reverse_string
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int length=0;
        String rev="";
        length=s.length();
        for(int i=length-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("Reversed string is "+rev);
    }
}