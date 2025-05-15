/*
Write a program to understand the concept of the Logical Operators
Logical_Operators:-are used to combine multiple boolean expressions or conditions
eg:-Logical AND(&&),Logical OR(||),Logical NOT(!)
KeyPoints:It is used to compare the values between boolean operators
*/
package operators;
public class LogicalOperators
{
    public static void main(String[] args)
    {
        int num1=10,num2=20;
        System.out.println("num1="+num1+",num2="+num2);
        //LOGICAL AND
        System.out.println("(num1>5 && num2>25):"+(num1>5 && num2>25));
        //LOGICAL OR
        System.out.println("(num1>5||num2>25):"+(num1>5 || num2>25));
        //LOGICAL NOT
        System.out.println("!(num1==5):"+!(num1==5));
    }
}
