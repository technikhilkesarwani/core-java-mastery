/* Write a program to understand the concept of the if-else statements
if-else statements:-if-else statements checks the boolean condition.
If the condition is true then if block will be executed, otherwise else block will be executed.
 */
package controlflow;
public class IfElseExample
{
    public static void main(String[] args)
    {
        //local variables
        int age=16;
        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }

    }
}
