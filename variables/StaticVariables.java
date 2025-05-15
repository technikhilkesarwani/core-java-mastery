/* Write a program to understand the concept of the static variables
Static_Variables:-The variables is said to be static if it is shared by all the objects of the class.It belongs to
the class not to the specific objects
Key Points:-It is said to be static as it is fixed and does not change with each object
It seems a lot of confusion between final and static so please be clear about it.
 */
package variables;
public class StaticVariables
{
    //static_variable
    static int count =0;

    StaticVariables()
    {
        //increase count when each time object is created.
        count++;
        System.out.println("Count is:"+ count);
    }

    public static void main(String[] args)
    {
        StaticVariables sv1=new StaticVariables();
        StaticVariables sv2=new StaticVariables();
        StaticVariables sv3=new StaticVariables();

    }
}
