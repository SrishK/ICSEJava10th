/*Read date, month and year from user. Display the new date adding 1 month to the
input date*/
import java.util.*;
class Newdate
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date,month and year");
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        int n[]={1,2,3,4,5,6,7,8,9,10,11,12,1};
        System.out.println("The new date is "+d+"-"+n[m]+"-"+y);
    }
}