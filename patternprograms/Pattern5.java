package patternprograms;
public class Pattern5
{
    public static void printPattern5(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        printPattern5(5);
    }
}
