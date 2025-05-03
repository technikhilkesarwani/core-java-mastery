package arrays;

public class InsertionSortWithFunctions
{
    //Function to sort an array using insertion sort
    public static void insertionSort(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];//Shift the element right
                j--;
            }
            arr[j+1]=key;//Place the key element in the right position
        }
    }
    //Main Method to test the Functions
    public static void main(String[] args)
    {
        //Step 1:Declaration & Initialisation
        int[] arr = {5, 3, 8, 6, 2};
        //Step 2:Calling the sorting function
        System.out.println("Before Sorting");
        printArray(arr);

        insertionSort(arr);
        //Step 5:Print the sorted array
        System.out.println("After Sorting");
        printArray(arr);
    }

    //Utility Function to Print the Array
    public static void printArray(int [] arr)
    {
        for(int num:arr)
        {
            System.out.print(num +" ");
        }
        System.out.println();
    }
}
