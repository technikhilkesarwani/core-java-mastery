package arrays;
public class MergeSortWithFunctions
{

    //Recursive Merge Sort
    public static void mergeSort(int[] arr,int low ,int high)
    {
        if(low<high)
        {
            int mid = (low + high) / 2;
            //Sort left half
            mergeSort(arr, low, mid);
            //Sort right half
            mergeSort(arr, mid + 1, high);
            //Merge both halves
            merge(arr, low, mid, high);

        }
    }
    //Merge Functions
    public static void merge(int []arr, int low, int mid,int high)
    {

        int[] temp=new int[high-low+1];//Temp Array
        int left=low;//left half
        int right=mid+1;//right half
        int k=0;//index for temp array
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp[k]=arr[left];
                left++;
                k++;
            }
            else
            {
                temp[k]=arr[right];
                right++;
                k++;
            }
        }
        //Copy the remaining elements of left half
        while(left<=mid)
        {
            temp[k]=arr[left];
            left++;
            k++;
        }
        //Copy the remaining elements of right half
        while(right<=high)
        {
            temp[k]=arr[right];
            right++;
            k++;
        }

        //Copy the temp array to original array
        for(int i=0;i<temp.length;i++)
        {
            arr[low+i]=temp[i];
        }
    }
    //Main Method to test the actual function
    public static void main(String[] args)
    {
        int []arr={3,1,2,4,1,5,6,2,4};

        System.out.println("Before Sorting");
        printArray(arr);

        mergeSort(arr,0,arr.length-1);

        System.out.println("After Sorting");
        printArray(arr);
    }

    //Utility Function to print the array
    public static void printArray(int [] arr)
    {
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
