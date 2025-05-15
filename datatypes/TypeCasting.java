/*
Write a program to understand the program of type_casting
 TypeCasting:-Typecasting is the process of conversion of one datatype into another datatype.
 KeyPoints:Typecasting is used to make the data_types compatible to used in program.
 1.Implicit TypeCasting:Also known as automatic typecasting
 smaller datatype:::larger datatype
 no data_loss
 2.Explicit TypeCasting:Also known as manual typecasting
 larger datatype::smaller datatype
 possible data_loss
 */
package datatypes;
public class TypeCasting
{
    public static void main(String[] args)
    {
        //Automatic TypeCasting..
        int integerValue=10;
        double doubleValue=integerValue;//int::double automatically
        System.out.println("The value using automatic TypeCasting:"+doubleValue);

        //Manual TypeCasting..
        double doubleValue2=20.99;
        int integerValue2=(int)doubleValue2;//double::int manually
        System.out.println("The value using manually TypeCasting:"+integerValue2);
    }

}
