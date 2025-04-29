//Write a program to understand the concepts of the BubbleSort
/* In Bubble Sort we use two variables i is to calculate the number of rounds j is to calculate
the number of swaps in each round */
package arrays;
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr={36,19,29,12,05};
        int n=arr.length;
        boolean swapped=false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        //Print the sorted array
        System.out.println("The sorted arrays:");
        for(int num:arr)
        {
            System.out.print(num + " ");
        }
    }
}
