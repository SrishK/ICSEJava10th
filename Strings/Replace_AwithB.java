/*Write a program to replace occurrence of character ‘A’ with ‘B’ in the entire String */
import java.util.*;
class Replace_AwithB
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int l=s.length();
        String str="";
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='A')
            {
             str=str+'B';
             continue;
            }
            else
            {
             str=str+s.charAt(i);
             continue;
            }
         }
        System.out.println(str);
     }
}
            