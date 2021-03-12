/*Write a program to check if input string is a palindrome*/
import java.util.*;
class palindrome_string
{
    public static void main()
    {
        //scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");//input
        String s1=sc.nextLine();
        String s2=s1;
        int l=s1.length()-1,c=0;
        //loop to check if reverse is equal to string or not
        for(int i=0,j=l;i<=l;i++,j--)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
             c++;
             continue;
            }
            else
            break;
        }
        //output
        if(c==s1.length())
        System.out.println("It is a palindrome");
        else
        System.out.println("It is a not palindrome");
    }
}