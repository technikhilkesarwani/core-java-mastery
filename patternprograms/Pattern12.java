package patternprograms;
public class Pattern12
{
    public static void printPattern12(int n)
    {
        int spaces=2*(n-1);
        for(int i=1;i<=n;i++)
        {
            //1.Printing the increasing  numbers
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            //2.Printing the spaces
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            //3.Printing the decreasing numbers
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;
        }
    }
    public static void main(String[] args)
    {
        printPattern12(5);
    }
}
