/* Write a program to understand the concept of the if-else-if statements
if-else-if statements are used to check multiple boolean conditions in sequence.
if any of the given condition is true then that block will be executed.
if none of the condition are true then optional block will be executed.
*/
package controlflow;
public class IfElseIfExample
{
    public static void main(String[] args) {
        int marks=75;
        if (marks>=90)
        {
            System.out.println("Grade A");
        }
        else if(marks>=75)
        {
            System.out.println("Grade B");
        }
        else if(marks>=60)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Fail");
        }
    }

}
