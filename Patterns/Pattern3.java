/*   
   1
  121
 12321
1234321
*/
class Pattern3
{
    public static void main()
    {
        
        int sp=3,x=1;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=x;j++)
            {
                System.out.print(j);
            }
            for(int j=x-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            sp--;
            x++;
        }
    }
}
                
                