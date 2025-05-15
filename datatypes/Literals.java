/*
Write a program to understand the concept of literals
Literal:-Literals are the constants used in Java to represent the fixed value
eg:- int num=100; 100 is literal
These values are directly assigned to variables.
Literals can be represented in different formats such as binary,octal,hexadecimal
 */
package datatypes;
public class Literals
{
    public static void main(String[] args)
    {
        int age=25;//Integer Literal
        float price=10.5f;//Floating Literal
        char grade='A';//Character Literal
        String name="Nikhil";//String Literal
        boolean isPass=true;//Boolean Literal

        System.out.println("Age: "+age);
        System.out.println("Price: "+price);
        System.out.println("Grade: "+grade);
        System.out.println("Name: "+name);
        System.out.println("Passed: "+isPass);
    }
}
