/*
ABCDEDCBA
 ABCDCBA
  ABCBA
   ABA
    A
 */
class Pattern8
{
    public static void main()
    {
            int spaces = 0;
            char ch = 'A';
            for(int i = 5; i >= 1; i--)
            {
                for(int r = 1; r <= spaces; r++)
                {
                    System.out.print(" ");
                }
                for(int r = 1; r <= i; r++)
                {
                    System.out.print(ch++);
                    
                }
                --ch;
                for(char c=--ch;c >= 65;c--)
                {
                    System.out.print(c);
                }
                
                ch = 'A';
                spaces++;
                System.out.println();
            }
        }
    }
