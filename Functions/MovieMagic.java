import java.util.*;
class MovieMagic
{   //Data members
    int year;
    String title;
    float rating;
    MovieMagic()//Default constructor
    {
        //Initialising data members
        year=0;
        rating=0.0f;
        title="";
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);//Scanner object
        //Accepting values from user
        System.out.println("Enter the movie name,release year and rating");
        title=sc.nextLine();
        year=sc.nextInt();
        rating=sc.nextFloat();
    }
    public void display()
    {
        //Diplaying the message based on the rating of the movie
        if(rating>=0.0 && rating<=2.0)
        {
            System.out.println(title+" is a flop");
        }
        if(rating>=2.1 && rating<=3.4)
        {
            System.out.println(title+" is a semi-hit");
        }
        if(rating>=3.5 && rating<=4.5)
        {
            System.out.println(title+" is a hit");
        }
        else
        {
            System.out.println(title+" is a super hit");
        }
    }
     public static void main()
    {
        MovieMagic obj=new MovieMagic();//Creating object and calling constructor
        obj.accept();//Calling accept method
        obj.display();//Calling display method
    }
}