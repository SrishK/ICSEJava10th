import java.util.*;
class Buzz
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int ld=n%20;
        if(ld==7 || n%7==0)
        {
            System.out.println("It is a buzz number");
        }
        else
        {
            System.out.println("It is not a buzz number");
        }
    }
}