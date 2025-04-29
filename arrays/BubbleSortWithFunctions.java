package arrays;
public class BubbleSortWithFunctions
{
    //Functions to perform the bubble sort
    public static void bubbleSort(int [] arr)
    {
        int n=arr.length;
        //Edge Case:
        if(n==0)
        {
            System.out.println("The array is empty");
            return;
        }
        else if(n==1)
        {
            System.out.println("Only one element");
            return ;
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //Swap
                    swap(arr,j,j+1);
                }
            }
        }
    }
    //Functions to swap two elements
    public static void swap(int[] arr,int i ,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //Functions to print array
    public static void printArray(int [] arr)
    {
        for(int num:arr)
        {
            System.out.print(num+ " ");
        }
        System.out.println();
    }

    //Main method to test the program
    public static void main(String[] args)
    {
        int [] arr={36,19,29,12,05};
        System.out.println("Original Array");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array");
        printArray(arr);
    }

}
