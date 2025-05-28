/*
Write a program to understand the concept of downward pyramid....
*/
package patternprograms;
public class Pattern8
{
    //Implementation_Logic
    public static void printPattern8(int n)
    {
        //count the number of lines--row
        for(int i=0;i<n;i++)
        {
            //spaces printing...
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            //star printing...
            for(int j=0;j<2*n-(2*i + 1);j++)
            {
                System.out.print("*");
            }
            //spaces printing...
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    //Main Method to run the function..
    public static void main(String[] args)
    {
        printPattern8(5);
    }
}
