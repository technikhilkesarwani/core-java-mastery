/*Write a program to understand the concept of even_odd programs*/
package basics;
public class EvenOdd
{
    public static void checkEvenOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println("The given number "+num+" is even");
        }
        else
        {
            System.out.println("The given number "+num+" is odd");
        }
    }
    //Main method to test the function
    public static void main(String[] args)
    {
        checkEvenOdd(9);
    }
}
