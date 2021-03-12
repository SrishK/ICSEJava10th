/*Write a program to give option to the user to add,subtrat or multiply two numbers using functions.*/
import java.util.*;
class Options 
{ 
    public int Addition(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    public int Substraction(int a, int b)
    {
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        int diff=max-min;
        return diff;
    }
    public int Product(int a, int b)
    {
        int pr=a*b;
        return pr;
    }
        
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Choice 1.Addition");
        System.out.println("Choice 2.Substraction");
        System.out.println("Choice 3.Multiplication");
        int ch=sc.nextInt();
        System.out.println("Enter 2 nos.");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Options f=new Options();
        switch(ch)
        {
          case 1: int s=f.Addition(x,y);
                 System.out.println("Sum of "+x+" and "+y+" is "+s);
                 break;
          case 2:int d=f.Substraction(x,y);
                 System.out.println("Difference of "+x+" and "+y+" is "+d);
                 break;
          case 3:int p=f.Product(x,y);
                 System.out.println("Product of "+x+" and "+y+" is "+p);
                 break;
          default:System.out.println("Invalid choice.");   
                  break;
        }
    }
}
            
            