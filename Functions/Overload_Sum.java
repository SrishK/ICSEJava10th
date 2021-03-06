/*Design a class to overload a function Sum( ) as follows:
(i) int Sum(int A, int B) - with two integer arguments (A and B) calculate and return sum of all the even numbers in the range of A and B.
Sample input: A=4 and B=6
Sample output: 4+6+8+10+12+14+16
(ii) double Sum(double N) - with one double arguments(N) calculate and return the product of the following series:
sum=1.0 x 1.2 x 1.4 x.......... x N
(iii) int Sum(int N) - with one integer argument (N) calculate and return sum of only odd digits of the number N. 
Sample input: N = 43961
Sample output: sum = 3+9+1 = 13
Write a main method to create an object and invoke the above methods.*/
import java.util.*;
public class Overload_Sum
{
    

    public static void main(String[]args)
    { 
        //Declaration and initialisation
        int x=0,y=0,p=0,a=0,c=0;
        double q=0,b=0;
        Scanner sc=new Scanner(System.in);//Scanner object
        //input
        System.out.println("Enter numbers for first method");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Enter number for second method");
        q=sc.nextDouble();
        System.out.println("Enter number for third method");
        p=sc.nextInt();
        //Object of class
        Overload_Sum obj = new Overload_Sum();
        //Calling the overloaded method sum     
        a = obj.Sum(x,y);
        b = obj.Sum(q);
        c = obj.Sum(p);
        
        //Output the three different sums
        System.out.println(a + "\n" + b + "\n" + c);
    }
    //calculates and return sum of all the even numbers in the range of A and B. 
    public int Sum(int A, int B)
    {
        int sum = 0;

        if(A%2 != 0)
            A = A+1;
        for(int i = A; i <= B; i += 2)
        {
            sum += i;
        }
        return sum;
    }
    /*calculates and return the product of the following series:
      sum=1.0 x 1.2 x 1.4 x.......... x N*/
    public double Sum(double N)
    {
        double sum = 1.0;

        for(double i = 1.2; i <= N; i += 0.2)
        {
            sum *= i;
        }
        return sum;
    }
    //calculate and return sum of only odd digits of the number N.  
    public int Sum(int N)
    {
        int sum = 0;
        int n = N;

        while(n > 0)
        {
            n = N%10;
            if(n %2 != 0)
            {
                sum += n;
            }
            N /= 10;
        }
        return sum;
    }
}
