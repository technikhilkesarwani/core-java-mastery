/* Write a program to understand the concept of Relational_Operator
Relational_Operator:Also known as the comparison_operator which are used to compare the two values:
KeyPoint to be noted-:The result of the relational operator is always boolean
eg:==,>,>=,<=,<,!=
*/
package operators;
public class RelationalOperators
{
    public static void main(String[] args)
    {
        int num1 = 20, num2 = 30;
        System.out.println("num1==num2: " + (num1 == num2));
        System.out.println("num1!=num2: " + (num1 != num2));
        System.out.println("num1>=num2: " + (num1 >= num2));
        System.out.println("num1<=num2: " + (num1 <= num2));
        System.out.println("num1>num2: " + (num1 > num2));
        System.out.println("num1<num2: " + (num1 < num2));
    }
}
