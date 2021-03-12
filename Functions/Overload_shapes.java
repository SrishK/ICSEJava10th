/*Overload function Area to find area of triangle, trapizium and rhombus. */
import java.util.*;
class Overload_shapes
{
    public void area(double a,double b,double c)
    {
        double s=a+b+c/2;
        double ar1=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of scalene triangle is-"+ar1);
    }
    public void area(int a,int b,int height)
    {
        double ar2=0.5*((double)height*(a+b));
        System.out.println("Area of trapezium is-"+ar2);
    }
    public void area(double diagonal1,double diagonal2)
    {
        double ar3=0.5*diagonal1*diagonal2;
        System.out.println("Area of rhombus is-"+ar3);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle");
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();
        System.out.println("Enter 2 sides of the trapezium and height");
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        int h=sc.nextInt();
        System.out.println("Enter 2 diagonals  of the rhombus");
        double r1=sc.nextDouble();
        double r2=sc.nextDouble();
        Overload obj=new Overload();
        obj.area(s1,s2,s3);
        obj.area(t1,t2,h);
        obj.area(r1,r2);
    }
}
        
        