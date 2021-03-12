/*Design a class to overload a function num_calc() as follows:

void num_calc(int num, char ch) with one integer argument and one char
 argument, computes the square of integer argument if choice ch is 's'
 otherwise find its cube.

 void num_calc(int a, int b, char ch) with two integer arguments and
 character argument. It computes the product of integer arguments if ch
 is 'p' else adds the integers.

 void num_calc(String s1, String s2) with two string arguments, which
 prints whether the strings are equal or not*/
import java.util.*;
public class Overload_calc
{
    //instantiate Scanner object
    static Scanner sc = new Scanner(System.in);
    /*one integer argument and one char
     argument, computes the square of integer argument if choice ch is 's'
     otherwise find its cube.*/

    public void num_calc(int num, char ch)
    {

        if(ch == 's')
        {
            double cube = Math.pow(num , 3);
            System.out.println("Cube: " + cube);
        }
        else
        {
            double square = Math.pow(num , 2);
            System.out.println("Square: " + square);
        }     
    }
    /*two integer arguments and
      character argument. It computes the product of integer arguments if ch
      is 'p' else adds the integers.*/

    void num_calc(int a, int b, char ch)
    {
        if(ch == 'p')
        {
            int p= a*b;
            System.out.println("Product: " + p);
        }
        else
        {
            int sum = a + b;
            System.out.println("Sum : " + sum);
        }
            
    }
    //two string arguments, which prints whether the strings are equal or not

    void num_calc(String s1, String s2)
    {
        boolean b = s1.equals(s2);

        if(b== true)
        {
            System.out.println("The two strings are equal");
        }

        else
        {
            System.out.println("The two strings are NOT equal");
        }
    }

    public static void main(String[]args)
    { 
        //Declaration and initialisation
        String str1="",str2="";
        int n=0,q=0,p=0;
        char c=' ',c1=' ';
        //Taking input for the methods
        System.out.println("Enter values for first function");
        n=sc.nextInt();
        c=sc.next().charAt(0);
        System.out.println("Enter values for second function");
        q=sc.nextInt();
        p=sc.nextInt();
        c1=sc.next().charAt(0);
        System.out.println("Enter values for third function");
        str1=sc.nextLine();
        sc.nextLine();
        str2=sc.nextLine();
        //object
        Overload_calc obj = new Overload_calc();
        //calling methods
        obj.num_calc(n,c);
        obj.num_calc(q,p,c1);
        obj.num_calc(str1,str2);

    }    
}
