/*Generate a next ID based on conditions specified .Rule ->It consists of 2 characters, an
alphabet followed by a digit, when the digit exceeds 9 alphabet increases. For e.g. if
current ID is C6 next would be C7 . If current is C9 next would be D0.*/
import java.util.*;
class ID
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter current ID");
        String s=sc.next();
        String str="";
        if(s.charAt(1)=='9')
        {
            int n=s.charAt(0)+1;
            str=str+(char)n;
            str=str+0;
        }
        if(s.charAt(1)>='0' && s.charAt(1)<='8')
        {
            str=str+s.charAt(0);
            str=str+(char)(s.charAt(1)+1);
        }
        System.out.println(str);
    }
} 
            