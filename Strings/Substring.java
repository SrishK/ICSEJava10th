/*Write a program to print the substring between location x and y specified by user
without using substring function.*/
import java.util.*;
class Substring
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int l=s.length();
        System.out.println("Enter x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int max=Math.max(x,y);
        int min=Math.min(x,y);
        for(int i=min;i<max;i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}
            