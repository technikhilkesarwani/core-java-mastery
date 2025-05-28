/* Write a program to understand the logic of pattern printing
Pattern_Printing:-
i)for outer loop we count the number of the lines...
ii) for inner loop we count  the number of the columns...& connect them to somehow rows...
iii)Printing the m*n pattern inside the inner loop.
iv)Observe Symmetry(optional)
Pattern 1:Square_Pattern
*/
package patternprograms;
public class Pattern1
{
    //Main Logic to Print the Pattern...
    public static void printPattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        printPattern1(5);
    }
}
