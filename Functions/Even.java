/*Write a function to check if the input number is a even number and return Boolean
true or false accordingly*/import java.util.*;
class Even
{
    public boolean testEven(int num)
    {
        boolean b;
        if(num%2==0)
        b=true;
        else
        b=false;
        return b;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number.");
        int n=sc.nextInt();
        Even f=new Even();
        boolean r=f.testEven(n);
        System.out.println(r);
    }
}
        
   