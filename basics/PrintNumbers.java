/* Program 2:-Write a program to understand the basic concepts of printing the number */
package basics;
public class PrintNumbers
{
    public static void main(String[] args)
    {
        //user_defined_function
        printNumbers(10);
    }
    public static void printNumbers(int num)
    {
        //Main Logic to be used in the program
        System.out.println("The printing numbers are ");
        for(int i=1;i<=num;i++)
        {
            System.out.println(i);
        }
    }

}
