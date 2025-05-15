/* Write a program to understand the concept of WrapperClass
Wrapper Class:-Wrapper Class in Java is used to wrap the primitive datatype into an object.
Java Collections Framework(eg:-ArrayList) works with objects not with primitive datatypes.
Enables the autoboxing and unboxing..
eg:-Integer,Float,Character,etc.
 */
package datatypes;
public class WrapperClass
{
    public static void main(String[] args)
    {
        //Integer
        int num=100;
        Integer numObj=num; //autoboxing;
        System.out.println("Integer: "+numObj);

        //Float
        float price=99.99f;
        Float priceObj=price;
        System.out.println("Float: "+priceObj);

        //Character
        char grade='A';
        Character gradeObj=grade;
        System.out.println("Character: "+gradeObj);

        //Boolean
        boolean isPassed=true;
        Boolean passObj=isPassed;
        System.out.println("Boolean: "+passObj);
    }
}
