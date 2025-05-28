package patternprograms;
public class Pattern14
{
    public static void printPattern14(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            char ch = 'A';
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        printPattern14(5);
    }

}
