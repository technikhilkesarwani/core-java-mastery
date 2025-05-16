/*
Write a program to illustrate how to take input from the user using scanner class
Scanner class is used to take the input from the user
import.java.util.Scanner ;imports the Scanner class for user input
Scanner scanner=new Scanner... Creates Scanner Object to take input
Scanner class has so many methods such as nextLine(),nextInt()
scanner.nextLine():Reads a string input(eg:-name)
scanner.nextInt():Reads a integer input(eg:-age)
scanner.close():free the system resources
*/

package userinputdemo;
import java.util.Scanner;
public class UserInputExample
{
    public static void main(String[] args)
    {
        //Create a scanner object to read input
        Scanner scanner=new Scanner(System.in);

        //Ask for user's name
        System.out.println("Enter your name:");
        String name=scanner.nextLine();

        //Ask for user's age
        System.out.println("Enter your age:");
        int age=scanner.nextInt();

        //Output the result
        System.out.println("Hello " +name+ ",you are "+age+" years old.");

        //Close the scanner to avoid the resource leak.
        scanner.close();
    }
}
