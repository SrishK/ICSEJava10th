/*Replace the occurrence of a vowel with the next vowel in a String*/
import java.util.*;
class nextVowel
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        char ch=' ';
        String str="";
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='a')
            {
                str=str+'e';
                 continue;
            }
            if(ch=='e')
            {
                str=str+'i';
                 continue;
            }
            if(ch=='i')
            {
                str=str+'o';
                 continue;
            }
            if(ch=='o')
            {
                str=str+'u';
                 continue;
            }
            if(ch=='u')
            {
                str=str+'a';
                 continue;
            }
            if(ch=='A')
            {
                str=str+'E';
            }
            if(ch=='E')
            {
                str=str+'I';
                 continue;
            }
            if(ch=='I')
            {
                str=str+'O';
                 continue;
            }
            if(ch=='O')
            {
                str=str+'U';
                continue;
            }
            if(ch=='U')
            {
                str=str+'A';
                continue;
            }
            else
            {
             str=str+ch;
            }
        }
        System.out.println(str);
    }
}