package patternprograms;
public class Pattern3
{
    public static void printPattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        printPattern3(5);
    }
}
