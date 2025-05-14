/* Write a program to understand the Fibonacci Series*/
//FibonacciSeries:0,1,1,2,3,5,8 int num1=0,num2=1;
package basics;
public class Fibonacci
{
    public static void printingFibonacciSeries(int count)
    {
        int num1=0,num2=1,num3;
        System.out.print("Fibonacci Series:" +num1 + " " +num2);
        for(int i=2;i<count;i++)
        {
            num3=num1+num2;
            System.out.print(" "+ num3);
            //Shifting values for next iteration
            num1=num2;
            num2=num3;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int count=3;
        printingFibonacciSeries(count);
    }
}
