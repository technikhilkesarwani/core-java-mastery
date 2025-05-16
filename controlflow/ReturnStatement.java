/*
Write a program to understand the concept of return statement
Return_Statement:-return statement is used to exit from the method and optionally returns a value back to the method's caller.
Syntax:return value;
 */
package controlflow;
public class ReturnStatement
{
    public static void printNumbers( )
    {
        for(int i=0;i<5;i++)
        {
            if(i==4)
            {
                return;//exit the method when i is 4
            }
            System.out.println("Value :"+i);
        }
    }
    public static void main(String[] args)
    {
        printNumbers();
    }
}
