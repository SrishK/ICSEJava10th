/*Read a String and display the piglatin form of the same . For example: If the given
word is “King”then the Pig-Latin form is “INGKAY”. Basically all the letters from the
first character till you find a vowel is moved to the end of the word and “ay” is
appended after that and the whole word is capitalised. */
import java.util.*;
class Piglatin
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);//Scanner object
        System.out.println("Enter string");//Taking input
        String s=sc.next().trim();
        //Declaration and Initialization
        int length=s.length();
        String str="",s1="";
        char c=' ';
        for(int i=0;i<length;i++)//Converting to piglatin
        {
            c=s.charAt(i);
            //checking for vowel
            if ( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || 
            c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                String s2=s.substring(0,i);
                s1=s.substring(i);
                str=s1.toUpperCase()+s2.toUpperCase()+"AY";
                break;
            }
        }
        System.out.println("piglatin-"+str);
    }
}