/*
123456789
2345678
34567
456
5
456
34567
2345678
123456789
 */
class Pattern6
{
    public static void main()
    {
        int k=0;
        for(int i = 1; i <= 5; i++ )
            {
                for (int r = 1 + k ; r <= 9 - k; r++)
                {
                    System.out.print(r);
                }
                k++;
                System.out.println();
            }
        k = 1;
        for(int i = 4; i >= 1; i-- )
            {
                for(int r = 5 - k ;r <= 5 + k; r++)
                {
                    System.out.print(r);
                }
                k++;
                System.out.println();
            }
    }
}