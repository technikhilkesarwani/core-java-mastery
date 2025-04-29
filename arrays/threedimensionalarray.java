/*Write a program to understand the concepts of three-dimensional arrays*/
package arrays;
public class threedimensionalarray
{
    //Step 1:Declaration of 3D Array
    public static void main(String[] args)
    {
        int[][][] myArray ={{{10,20},{30,40,50,60},{70,80,90}}};
        //System.out.println(myArray);O/P:-[[[I@7b23ec81;
        //System.out.println(myArray[0]);O/P:-[[I@7b23ec81;
        //System.out.println(myArray[0][0]);O/P:-[I@7b23ec81;
        //System.out.println(myArray[0][0][0]);
        //Output:10;
        //System.out.println(myArray[0][0][1]);
        //Output:20;
        //System.out.println(myArray[0].length);
        //Output:3
        //System.out.println(myArray[0][0].length);
        //Output:2
        //System.out.println(myArray.length);
        //Output:1
        //System.out.println(myArray[0][0][0].length);

        for(int i=0;i<myArray.length;i++)
        {
            for(int j=0;j<myArray[i].length;j++)
            {
                for(int k=0;k<myArray[i][j].length;k++)
                {
                    System.out.print(myArray[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
