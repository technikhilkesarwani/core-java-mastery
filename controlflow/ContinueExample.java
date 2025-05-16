/*
Write a program to understand the concept of the continue statement
continue_statement:-It is used to skip the current iteration of the loop and move to the next iteration without completing the remaining code in loop
for that iteration.Syntax:continue;
*/
package controlflow;
public class ContinueExample
{
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            if(i==2)
            {
                continue;//skips the current iteration of the loop and jumps to the next iteration
            }
            System.out.println("The value:"+i);
        }
        System.out.println("The loops ended here");
    }
}
