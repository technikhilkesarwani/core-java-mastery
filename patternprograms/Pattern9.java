package patternprograms;
public class Pattern9
{
    public static void printPattern7(int n) {
        for (int i = 0; i < n; i++) {
            //spaces printing..
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            //star printing...
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //spaces printing...
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern8(int n) {
        //count the number of lines--row
        for (int i = 0; i < n; i++) {
            //spaces printing...
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //star printing...
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //spaces printing...
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        printPattern7(5);
        printPattern8(5);
    }
}