/*Write a program to Store the names of Facebook contact in an array of size 10. Count
the number of contacts which start with alphabet ‘A’*/
import java.util.*;
class Facebook
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s[]=new String[10];
        int count=0;
        char ch=' ';
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter contact name.");
            s[i]=sc.nextLine();
        }
        for(int j=0;j<10;j++)
        {
            ch=s[j].charAt(0);
            if(ch=='A')
            {
                count++;
            }
        }
        System.out.println("Number of names starting with 'A' are "+count);
    }
}