/*Read a number and display corresponding month name and no of days in it. For e.g. if
the input is 5 output must be May has 31 days*/
import java.util.*;
class Months_days
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String s[]={"Jan","Feb","March","April","May","June","July","August","Sept","Oct","Nov","Dec"};
        System.out.println("Select month");
        int i=sc.nextInt();
        System.out.println("The name of the month is "+s[i-1]+" and the number of days is "+n[i-1]);
    }
}
        
        