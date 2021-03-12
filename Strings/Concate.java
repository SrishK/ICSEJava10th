/*Read 2 strings and concatenate second one in front of the first one*/
import java.util.*;
class Concate
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int l1=s1.length();
        int l2=s2.length();
        String s3="";
        for(int i=0;i<l2;i++)
        {
            s3=s3+s2.charAt(i);
        }
        for(int j=0;j<l1;j++)
        {
            s3=s3+s1.charAt(j);
        }
        System.out.println(s3);
    }
}