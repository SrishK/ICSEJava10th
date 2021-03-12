/*Write a program to find the maximum, minimum and average of three numbers using different functions.*/
import java.util.*;
class MaxMinAvg
{
    public double min(double a,double b, double c)
    {
        double min2=Math.min(a,(Math.min(b,c)));
        return min2;
    }
    public double max(double a, double b,double c)
    {
        double max2=Math.max(a,(Math.max(b,c)));
        return max2;
    }
    public double average(double a,double b,double c)
    {
        double avg2=(a+b+c)/3;
        return avg2;
    }  
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 nos.");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        MaxMinAvg n=new MaxMinAvg();
        double min1=n.min(a,b,c);
        double max1=n.max(a,b,c);
        double avg1=n.average(a,b,c);
        System.out.println("Minimum number is"+min1);
        System.out.println("Maximum number is"+max1);
        System.out.println("Average of numbers is"+avg1);
    }
}
        
        
        