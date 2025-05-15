/*
Write a program to understand the concept of the unary operator:
Unary Operator:Unary Operator operates on only one operand.
These are often used to increment/decrement the values,negating expressions or inverting boolean values
eg:-+,-,++,--,!
 */
package operators;
public class UnaryOperator
{
    public static void main(String[] args)
    {
        int num=10;
        boolean flag=true;
        System.out.println("The initial value of num:" +num);

        System.out.println("Unary Plus:+num=" +(+num));
        System.out.println("Unary Minus:-num=" +(-num));

        System.out.println("Pre-increment:++num= " +(++num));
        System.out.println("Post-increment:num++= " +(num++));
        System.out.println("The value after post increment:"+num);

        System.out.println("Pre-decrement:--num= " +(--num));
        System.out.println("Post-decrement:num--= " +(num--));
        System.out.println("The value after post decrement:"+num);

        System.out.println("Logical NOT of flag: !flag = "+(!flag));
    }
}
