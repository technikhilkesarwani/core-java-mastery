/*
 Write a program to check the number is prime or not
 Prime Number:The number is said to be prime if it is divisible by the number itself and 1 only .
*/
package basics;
public class PrimeCheck
{
    public static boolean isPrime(int num)
    {
        if(num<2) return false;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int num=7;
        if(isPrime(num))
            System.out.println( num +" is Prime");
        else
            System.out.println(num +" is not Prime");
    }
}
