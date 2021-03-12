/*Define a class RESORT with the following specifications.
Data members: roomno- int,
 name- string,
 charges- float,
 days- int,
 amount- float.
Member function: compute( ) - To calculate and return amount as days * charges
and if the value of days * charges is more than 2100 then as 1.5 * days * charges.
Constructor: To assign roomno as 786, name as BOSS, charges as 420 and days as 7.
Member Functions: enterdetails ( )– to input data and invoke compute( ) function.
display ( ) – to display the details of the customer*/
import java.util.*;
class Resort
{
    int room_no,days;
    String name;
    float charges,amount;
    Resort(int n,String str,float f,int d)
    {
        room_no=n;
        name=str;
        charges=f;
        days=d;
    }
    public void enterdetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String n2=sc.nextLine();
        System.out.println("Enter room number");
        int r=sc.nextInt();
        System.out.println("Enter charge");
        float f2=sc.nextFloat();
        System.out.println("Enter number of days");
        int d2=sc.nextInt();
        room_no=r;
        name=n2;
        charges=f2;
        days=d2;
    }
    public void compute()
    {
    {
        float a1=0;
        a1=days*charges;
        if(a1>2100)
        amount=1.5f*a1;
        else amount=a1;
    }
    }
    public void display()
    {
        System.out.println("Name- "+name);
        System.out.println("No. of days- "+days);
        System.out.println("Total amount(Ruppees)- "+amount);
    }
    public static void main()
    {
        Resort obj=new Resort(786,"BOSS",420,7);
        obj.enterdetails();
        obj.compute();
        obj.display();
    }
}