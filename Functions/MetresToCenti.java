/*Write a program to convert metres into centimetres using a function.*/
import java.util.*;
class MetresToCenti
{
    public double metres(double d1)
    {
      double cm=d1*100;
      return cm;
    }   
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance in metres.");
        int d=sc.nextInt();
        MetresToCenti f=new MetresToCenti();
        double c=f.metres(d);
        System.out.println("Distance in centimetres is"+c);
    }
}
        