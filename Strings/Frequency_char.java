/*Print the frequency of a particular character input by user*/
import java.util.*;
class Frequency_char
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        System.out.println("Enter character");
        char c=sc.next().charAt(0);
        int l=s.length()-1;
        char ch=' ';
        int count=0;
        for(int i=0;i<=l;i++)
        {
            ch=s.charAt(i);
            if(ch==c)
            count++;
        }
        System.out.println("Frequency of "+c+" is "+count);
    }
}