/*
   1
  121
 12321
1234321
 12321
  121
   1
 */
 class Pattern7
 {
     public static void main()
     {
            int spaces = 3;
            for(int i = 1; i <= 4; i++)
            {
                for(int r = 1; r <= spaces; r++)
                {
                    System.out.print(" ");
                }
                for(int r = 1; r <= i; r++)
                {
                    System.out.print(r);

                }
                for(int r = i - 1; r >= 1; r--)
                {
                    System.out.print(r);
                }

                spaces--;
                System.out.println();
            }
            spaces = 1;
            for(int i = 3; i >= 1; i--)
            {
                for(int r = 1; r <= spaces; r++)
                {
                    System.out.print(" ");
                }
                for(int r = 1; r <= i; r++)
                {
                    System.out.print(r);

                }
                for(int r = i - 1; r >= 1; r--)
                {
                    System.out.print(r);
                }

                spaces++;
                System.out.println();
            }
        }
    }