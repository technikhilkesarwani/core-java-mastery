/* Write a program to understand the concept of factorial of given number
Factorial n!=n*(n-1)*(n-2)*...1
eg:-3!=6
*/
package basics;
public class Factorial
{
    //Method to find the factorial of given number
    public static int findFactorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        return fact;
    }
    //Main Method to print the factorial of given number
    public static void main(String[] args)
    {
        int result=findFactorial(3);
        System.out.println("Factorial:" +result);
    }
}
