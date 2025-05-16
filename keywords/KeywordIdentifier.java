/* Write a program to understand the concept of keywords and identifiers
Keywords:Keywords are the pre-defined reserved keywords that a java compiler can easily understand.
Points:Java Keywords cannot be used as identifiers

Identifiers:Identifiers are the name given to either class,constructor ,method etc.
*  */
package keywords;
public class KeywordIdentifier
{
    //'int' is a keyword and 'age' is an identifier
    int age=18;

    //'public' and 'void' are keywords 'showDetails' is an identifier
    public void showDetails()
    {
        //'System','out' and 'println' are identifiers
        System.out.println("Age is "+age);
    }
    //'main' 'String' ,'args' are identifiers,'static and 'public' are keywords
    public static void main(String[] args)
    {
        //'new' is a keyword ,'obj' is an identifier
        KeywordIdentifier obj=new KeywordIdentifier();
        obj.showDetails();
    }
}
