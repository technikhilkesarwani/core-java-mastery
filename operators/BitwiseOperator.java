/*
Write a program to understand the concept of bitwise operator
Bitwise_Operator:Bitwise Operator are used to perform the operation on bits(0s and 1s) of integer values.
Bitwise AND:& 1 if both bits are 1,Bitwise OR: ',Bitwise XOR:^1 if bits are different
Bitwise Complement:~ Inverts all bits(1's Complement)
Left Shift:<<,Right Shift:>>,Unsigned Right Shift:>>>
 */
package operators;
public class BitwiseOperator {

    public static void main(String[] args)
    {
        int num1 = 5;//0101
        int num2 = 3;//0011
        System.out.println("num1= " + num1 + ",num2=" + num2);
        System.out.println("num1 & num2=" + (num1 & num2));//1
        System.out.println("num1 | num2=" + (num1 | num2));//7
        System.out.println("num1 ^ num2="+(num1^num2));//6
        System.out.println("~num1="+(~num1));//-6(invert all bits)
        System.out.println("num1<<1="+(num1<<1));//10
        System.out.println("num1>>1="+(num1>>1));//2
        System.out.println("num1>>>1="+(num1>>>1));//2(unsigned right shift)
    }
}
