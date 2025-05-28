package patternprograms;
public class Pattern20
{
    public static void printPattern20(int n)
    {
        int spaces=2*n-2;
        for(int i=1;i<=(2*n-1);i++)
        {
            //stars
            int stars=i;
            if(i>n)
                stars=2*n-i;
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            System.out.println();

            if(i<n)
                spaces-=2;
            else
                spaces+=2;
        }

    }
    public static void main(String[] args)
    {
        printPattern20(5);
    }
}
