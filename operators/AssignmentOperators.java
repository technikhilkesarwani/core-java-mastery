/*
Write a program to understand the concept of assignment operators
Assignment_Operators:These are used to assign the value to the operators.
eg:=,+=.-=,*=,/=,%=
 */
package operators;
public class AssignmentOperators
{
    public static void main(String[] args)
    {
        int num=10;
        System.out.println("Value1 :"+num);
        num+=10;
        System.out.println("Value2:"+num);
        num-=10;
        System.out.println("Value3: "+num);
        num*=10;
        System.out.println("Value4: "+num);
        num/=10;
        System.out.println("Value5: "+num);
        num%=5;
        System.out.println("Value6: "+num);
    }
}
