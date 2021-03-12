import java.util.*;
class Frequecy_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            n[i]=sc.nextInt();
        }
        int flag=0,count=0;
        for(int i=0;i<10;i++)
        {
            
            flag=0;
            for(int j=0;j<i;j++)
            {
                if(n[j]==n[i])
                {
                    flag++;
                }
            }
            if(flag>0)
            {
             continue;
            }
            else
            {
             
                 count=0;
                 for(int j=0;j<10;j++)
                 {
                    if(n[j]==n[i])
                    {
                     count++;
                    }
                }
               System.out.println("The frequency of "+n[i]+" is "+count);
            
       }
    }
  }
}
                
        
            