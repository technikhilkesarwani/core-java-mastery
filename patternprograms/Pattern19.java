package patternprograms;
public class Pattern19
{
    public static void printPattern19(int n)
    {
        int iniSpace=0;
        for(int i=0;i<n;i++)
        {
            //star printing
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            //spaces printing
            for (int j = 0; j < iniSpace; j++) {
                System.out.print(" ");
            }
            //star printing
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            iniSpace = iniSpace + 2;
            System.out.println();
        }
            //downwards...
            //star printing
            iniSpace=2*(n-1);
            for(int i=1;i<=n;i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                //spaces printing
                for (int j = 0; j < iniSpace; j++)
                {
                    System.out.print(" ");
                }
                //star printing
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
                iniSpace=iniSpace-2;
            }
        }
    public static void main(String[] args)
    {
      printPattern19(4);
    }
}
