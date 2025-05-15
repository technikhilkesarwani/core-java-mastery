/*
Write a program to understand the concept of the local variables...
Local_Variables:-The variables defined within the method or block or constructor
The variables that has a scope only inside the block.
Key Points:
i)The local variables is created at the time of declaration and destroyed after exiting from block.
ii)Initialisation of local variable is mandatory.
*/
package variables;
public class LocalVariables
{
    public static void main(String[] args)
    {
        //Declaration of the local_variables
        int var=10;
        //Variables local to main method only
        System.out.println("The value of the local variable is "+var);
    }

}
