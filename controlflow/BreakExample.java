/*
Write a program to understand the concept of Break Statement:-
Jump Statements:-Jump Statements are those statements which are used to transfer the flow from one part of the program
to another part of the program.eg:-break,continue,return
break statement:-break statement is used to exit the loop(for,while,do-while) or exit switch statement before
it has completed the normal execution of the program.
Syntax:break;
*/
package controlflow;
public class BreakExample
{
    public static void main(String[] args)
    {
        System.out.println("Using break statement to stop loop early:");
        for(int i=0;i<5;i++)
        {
            if(i==2)
            {
                //Loops stops when i equals 2
                break;
            }
            System.out.println("The value: "+i);
        }
        System.out.println("Loop ended after break");
    }
}
