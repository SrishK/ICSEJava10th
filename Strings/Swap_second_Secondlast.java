/*Swap the content of second alphabet with second last alphabet of each word of
sentence*/
import java.util.*;
class Swap_second_Secondlast
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        int c=0,c1=0;
        String str="",finalstr="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
               str=str+ch;
            }
            if(ch==' ')
            {
                int l1=str.length();
                for(int j=0;j<l1;j++)
                {
                    if(j==1)
                    finalstr=finalstr+str.charAt(l1-2);
                    else if(j==l1-2)
                    finalstr=finalstr+str.charAt(1);
                    else
                    finalstr=finalstr+str.charAt(j);
                }
                System.out.print(finalstr+" ");
                finalstr="";
                str="";
            }
        }
    } 
}                 