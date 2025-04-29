/* Selection Sort is a simple sorting algorithm in which we have to perform the two main tasks:
1.Finding the smallest element in the arrays list.
2.Put it at the beginning.
Then finding the next smallest element and put in the next position till the elements get it sorted.
 */
package arrays;
public class SelectionSortWithFunctions
{
    //Functions on the selection sort
    public static void SelectionSort(int [] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

    //Functions of printing the arrays
    public static void printArray(int [] arr)
    {
        for(int num:arr)
        {
            System.out.print(num +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int []arr={34,56,78,12,45};
        System.out.print("The elements before the selection sorting ");
        printArray(arr);

        SelectionSort(arr);
        System.out.print("The elements after the selection sorting ");
        printArray(arr);
    }
}
