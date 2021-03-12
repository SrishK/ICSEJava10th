/*Define a class named movieMagic with the following description:
Instance variables/data members:
int year            –           to store the year of release of a movie
String title       –           to store the title of the movie.
float rating      –           to store the popularity rating of the movie. (minimum rating = 0.0 and maximum rating = 5.0)
Member Methods:
(i)         movieMagic()              Default constructor to initialize numeric data members to 0 and String data member to “”.
(ii)        void accept()               To input and store year, title and rating.
(iii)       void display()              To display the title of a movie and a message based on the rating as per the table below.
Rating	Message to be displayed
0.0 to 2.0	Flop
2.1 to 3.4	Semi-hit
3.5 to 4.5	Hit
4.6 to 5.0	Super Hit*/
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