/*Find the Reverse of a string and check if it is palindrome */
import java.util.*;
class Reverse_palindrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int l=s.length();
        String rev="";
        for(int i=l-1;i>=0;i--)
        {
          rev+=i;
        }
        if(s.compareTo(rev)==0)
        {
            System.out.println("String is a palindrome");
        }
        else
        System.out.println("String is a palindrome");
    }
}
        