/*
$
$$
$$$
$$$$
$$$$$*/
class Pattern11
{
    public static void main()
    {
        char d='$';
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(d);
            }
            System.out.println("");
        }
    }
}