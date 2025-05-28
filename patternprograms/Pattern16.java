package patternprograms;
public class Pattern16
{
    public static void printPattern16(int n)
    {
        for(int i=0;i<n;i++)
        {
            char ch=(char)('A'+ i);
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
         printPattern16(5);
    }
}
