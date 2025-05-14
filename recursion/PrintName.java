/* Program 1:
Write a program to print the names N times using recursion
Key points to be noted for the recursion
1.Base Conditions
2.Recursive Call
*/
package recursion;
public class PrintName
{
    //the function printName() is being made here
    public static void printName(String name,int n)
    {
        //Base_Conditions
        if(n==0)
        {
            return;
        }
        System.out.println(name);
        //Recursive_Call
        printName(name,n-1);
    }
    //Main method to test the function
    public static void main(String[] args)
    {
        //Calling the user function printName();
        printName("Nikhil",5);
    }
}
