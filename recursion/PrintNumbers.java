/*
Program 2:
Write a program to print the numbers from 1 to N using recursion
Key points to be noted for the recursion
1.Base Conditions
2.Recursive Call
 */
package recursion;
public class PrintNumbers
{
    public static void printNumber(int i,int N)
    {
        //1.Base Conditions
        if(i>N)
        {
            return;
        }
        //Printing the values of i from 1 to N
        System.out.println(i);

        //2.Recursive Call
        printNumber(i+1,N);
    }
    //Main method to test the function
    public static void main(String[] args)
    {
        int N=5;
        //Calling the function printNumber(i,N);
        System.out.println("The numbers from 1 to " +N+ ": ");
        printNumber(1,N);
    }
}
