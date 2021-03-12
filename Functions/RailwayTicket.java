/*Define a class RailwayTicket with following description :
Instance variables/ Data Members:
String name             :   to store the name of the customer
String coach            :   to store the type of coach customer wants to travel
long mobno             :   to store customers mobile number
int amt                     : to store basic amount of ticket
int totalamt              :  to store the amount to be paid after updating the original amount
Member Methods :
RailwayTicket( )  -  default constructor to initialize the data members with default values.
void accept( )    -  to take input for name, coach, mobile number and amount
void update( )   -   to update the amount as per the coach selected
		(extra amount to be added in the amount as follows)
Type of coaches	Amount
First_AC	700
Second_AC	500
Third_AC	250
Sleeper	None
void display( )  -  to display all details of a customer such as name, coach, total amount and mobile number.
Write the main method to create an object of the class and call the above member methods.*/
import java.util.*;
public class RailwayTicket
{
    //instantiate Scanner object
    Scanner sc = new Scanner(System.in);

    //member variables
    String name = "";
    String coach = "";
    long mobno = 0;
    double amt = 0;
    double totalamt = 0;    
    public void accept()
    {
        System.out.println("Please enter name,number and amount");
        name = sc.nextLine().trim();
        mobno = sc.nextLong();
        amt=sc.nextDouble();
        System.out.println("Coaches:");
        System.out.println("1.First_AC");
        System.out.println("2.Second_AC");
        System.out.println("3.Third_AC");
        System.out.println("4.Sleeper_AC");

        System.out.println("Please input choice");
        coach = sc.next();

    }

    public void update()
    {
        if (coach.equalsIgnoreCase("First_AC"))
        {    totalamt = amt + 700;
        }
        else if (coach.equalsIgnoreCase("Second_AC"))
        {  
            totalamt = amt + 500;
        }
        else if (coach.equalsIgnoreCase("Third_AC")) 
        {   
            totalamt = amt + 250;
        }
        else if (coach.equalsIgnoreCase("Sleeper_AC"))
        {   
            totalamt = amt + 0;
        }
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Coach:" + coach );
        System.out.println("Mobile no: " + mobno);
        System.out.println("Total amt: " + totalamt);
    }

    public static void main(String[]args)
    {
        //object for calling
        RailwayTicket obj = new  RailwayTicket();

        //calling the methods
        obj.accept();
        obj.update();
        obj.display();
    }
}
