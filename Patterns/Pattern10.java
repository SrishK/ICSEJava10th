/*
1
23
456
78910
1112131415*/
class Pattern10
{
    public static void main()
    {
        int k=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println("");
        }
    }
}