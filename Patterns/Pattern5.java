/*
13579
1357
135
13
1
 */class Pattern5
{
    public static void main()
    {
        int k=1;
        for(int i=5;i>=1;i--)
        {
            k=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                k=k+2;
            }
            System.out.println("");
        }
    }
}