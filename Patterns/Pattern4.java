/*
   A
  ABA
 ABCBA
ABCDCBA
 */
class Pattern4
{
    public static void main()
    {
        int sp=3;
        char ch,x='A',y=x;
        for(int i=1;i<=4;i++)
        {
           x=y;
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(ch='A';ch<=x;ch++)
            {
                System.out.print(ch);
            }
            x--;
            for(ch=x;ch>='A';ch--)
           {
                System.out.print(ch);
            }
            System.out.println();
            sp--;
            y++;
        }
    }
}