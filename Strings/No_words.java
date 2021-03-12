/*Count no of words in a sentence*/
import java.util.*;
class No_words
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int length=0,ch=0,count=0,c=0;
        length=s.length();
        for(int i=0;i<length;i++)
        {
            ch=(int)s.charAt(i);
            if(ch==32)
            {
                count++;
            }
        }
        c=count+1;
        System.out.println("Number of words in the string is "+c);
    }
}
        
            