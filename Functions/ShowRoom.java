/*Design a class name ShowRoom with the following description :
Instance variables/ Data members :
String name – To store the name of the customer
long mobno – To store the mobile number of the customer
double cost – To store the cost of the items purchased
double dis – To store the discount amount
double amount – To store the amount to be paid after discount
Member methods: –
ShowRoom() – default constructor to initialize data members
void input() – To input customer name, mobile number, cost
void calculate() – To calculate discount on the cost of purchased items, based on following criteria

Cost	Discount (in percentage)
Less than or equal to ₹ 10000	5%
More than ₹ 10000 and less than or equal to ₹ 20000	10%
More than ₹ 20000 and less than or equal to ₹ 35000	15%
More than ₹ 35000	20%
void display() – To display customer name, mobile number, amount to be paid after discount
Write a main method to create an object of the class and call the above member methods.*/
import java.util.*;
class ShowRoom
{
    String name;
    long mobno;
    double cost,dis,amount;
    public void input()
    {
        Scanner sc=new Scanner(System.in);//Scanner object for taking input
        System.out.println("Enter name");
        name=sc.nextLine();//To accept name
        sc.nextLine();
        System.out.println("Enter mobile number");
        mobno=sc.nextLong();//To accept mobile number
        System.out.println("Enter cost");
        cost=sc.nextDouble();//To accept cost
    }
    public void calculate()
    {//if else statements to find final amount
      if(cost<=10000)
      {
          dis=(0.05)*cost;
          amount=cost-dis;
      }
      else if(cost>10000 && cost<=20000)
      {
          dis=(0.10)*cost;
          amount=cost-dis;
        }
        else if(cost>20000 && cost<=35000)
      {
          dis=(0.15)*cost;
          amount=cost-dis;
        }
        else 
      {
          dis=(0.20)*cost;
          amount=cost-dis;
        }
    }
    public void display()
    {
        System.out.println("Name- "+name);//Displaying name
        System.out.println("Mobile number- "+mobno);//Displaying mobile number
        System.out.println("Amount after discount- "+amount);//Displaying amount after discount
    }
    public static void main()
    {
        ShowRoom obj=new ShowRoom();//Making object of ShowRoom class
        obj.input();//Calling input method
        obj.calculate();//Calling calculate method
        obj.display();//Calling display method
    }
}
        