/*11111
2222
333
44
5*/
class Pattern2
{
    public static void main()
    {
        
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(i);
            }
            System.out.println();
            
        }
    }
}      