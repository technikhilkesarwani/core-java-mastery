/*
Write a program to understand the concept of DoWhileLoop Example
DoWhileLoop:-While loop is used to repeat the block of the code as long specific condition is true
KeyPoints:DoWhileLoop is executed atleast once and then repeatedly as long as condition is true.
 */
package controlflow;
public class DoWhileLoopExample
{
    public static void main(String[] args)
    {
        int i=0;//Initialisation
        do
        {
            System.out.println("Namaste_Duniya");//loop body
            i++;//Increment
        }
        while(i<=5);//Condition(checked after loop body runs once)
    }
}
