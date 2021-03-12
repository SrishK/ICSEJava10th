import java.util.Scanner;
public class Happy
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);//Scanner object
        int d,sum=0,n,sqr;//Declaration
        System.out.println("Enter a number");//Taking input
        n=sc.nextInt();
        int gn;//Making copy of the number
        gn=n;
        
        while(n>9)//To check whether the number is happy
        {
            sum=0;
            while(n!=0)
            {
                d=n%10;
                sqr=d*d;
                sum=sum+sqr;
                n=n/10;
            }
            n=sum;
        }
        if(n==1)//to print the output
        {
            System.out.println("Is a Happy number");
        }
        else
        {
            System.out.println("Not a happy number ");
            }
  }
}
    
