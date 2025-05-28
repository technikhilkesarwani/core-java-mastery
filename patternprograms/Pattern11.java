package patternprograms;
public class Pattern11
{
    public static void printPattern11(int n)
    {
        for(int i=0;i<n;i++)
        {
            int start=1;
            if(i%2==0)
                start=1;
            else
                start=0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        printPattern11(5);
    }
}
