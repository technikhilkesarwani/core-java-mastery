/*Write a program to understand the concept of switch case statements
SwitchCase:It is a control flow statement that allows us to execute one block of code out of many based on the value of expression or variable.
break statement is always used in the switch case example.If no matching case is found and there is no default case then nothing is executed...
switch only runs the code inside the marching case condition only...
*/
package controlflow;
public class SwitchCaseExample
{
    public static void main(String[] args)
    {
        int day=2;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
