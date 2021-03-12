/*Read a single digit and display the same in word. For e.g. input 1 output ->One*/
import java.util.*;
class NumberName
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN"};
        System.out.println("Enter single digit number.");
        int n=sc.nextInt();
        System.out.println(n+" in words is "+s[n]);
    }
}