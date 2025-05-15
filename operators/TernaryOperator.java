/*
Ternary Operator:It is a shorthand property for if-else statements.
KeyPoints:-The only operator which takes only three operands used to evaluate a condition and return one of two values
Syntax:condition?value_if_true:value_if_false;
 */
package operators;
public class TernaryOperator
{
    public static void main(String[] args)
    {
        int num1=10;
        int num2=20;

        //finding the maximum value
        int max=(num1>num2)?num1:num2;
        System.out.println("num1= "+num1+" ,num2="+num2);
        System.out.println("The maximum value:"+max);

        //check even or odd
        int num=7;
        String result=((num%2==0)?"Even":"Odd");
        System.out.println("Number is : "+result);
    }
}
