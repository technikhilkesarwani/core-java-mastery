/* Write a program to understand the concept of the recursion if the base conditions are not met or fulfilled...
* Recursion:It means when the method is called by itself to solve the problem until the specific conditions met
* Infinite Recursion:Recursion is said to be infinite if the base conditions are not met the function keep calling itself again and again
 */
package recursion;
public class InfiniteRecursion
{
    //User defined function callMe();
    public static void callMe( )
    {
        System.out.println("Calling");
        callMe();//No Base Condition Met Here
    }
    //Execution of the program starts here with callMe() functions
    public static void main(String[] args)
    {
        callMe();
    }
}
