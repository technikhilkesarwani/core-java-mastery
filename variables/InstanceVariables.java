/*
Write a program to understand the concept of the instance_variables...
Instance_Variables:-Also known as the non-static variables that is defined outside the method or block or constructor
,it should be inside the class
The variables that has a scope only not only inside the block but also outside the block.
Key Points:
i)As instance variables declared inside the class so it is created when an object are created and destroyed.
ii)can be accessed only by creating an object.
iii)initialisation of instance_variable is not mandatory
*/
package variables;
public class InstanceVariables
{
    //Declaration of the instance_variables
    int num1=10;
    // the user defined method
    void m1()
    {
        //Local_variables
        int num2=10;
        //Printing the local and instance variables
        System.out.println("The value of the local variables is " + num2);
        System.out.println("The sum of the instance variable and local variables is : "+(+num1 + num2));
    }
    public static void main(String[] args)
    {
        //Creating object to access instance method and variables
        InstanceVariables iv=new InstanceVariables();
        iv.m1();
    }
}

