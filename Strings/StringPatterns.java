/*. Display below patterns
 PANKAJ
 PANKA
 PANK
 PAN
 PA
 P
 PPPPPP
 AAAAA
 NNNN
 KKK
 AA
 J*/
class StringPatterns
{
    public static void main()
    {
       String s="PANKAJ";
       for(int i=6;i>0;i--)
       {
         for(int j=0;j<i;j++)
         {
             System.out.print(s.charAt(j));
         }
         System.out.println("");
       }
       for(int i=0;i<6;i++)
       {
           char ch=s.charAt(i);
           for(int j=6;j>i;j--)
           {
               System.out.print(ch);
            }
           System.out.println("");
       }
    }
}