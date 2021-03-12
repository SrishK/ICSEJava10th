import java.util.*;
class Parkinglot
{
    int vno,hours;
    double bill;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vehicle number");
        vno=sc.nextInt();
        System.out.println("Enter number of hours");
        hours=sc.nextInt();
    }
    public void calculate()
    {
     if(hours<=1)
     {
         bill=3*hours;
        }
        else
        {
            bill=(hours-1)*1.50+3;
        }
    }
    public void display()
    {
        System.out.println("Vehicle number-"+vno);
        System.out.println("Number of hours-"+hours);
        System.out.println("Bill-"+bill);
    }
    public static void main()
    {
        Parkinglot obj=new Parkinglot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
          
        
        
        
