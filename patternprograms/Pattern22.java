package patternprograms;
import static java.lang.Math.min;
public class Pattern22
{
    public static void printPattern22(int n)
    {
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                System.out.print(n- min(min(top,bottom), min(left,right)));
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        printPattern22(4);
    }
}
