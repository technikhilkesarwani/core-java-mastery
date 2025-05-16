/*
Write a program to understand the concept of the linear search--
Linear_Search:Also known as sequential search in which our main task is to find the elements sequentially if the
elements found then we need to return the elements otherwise return elements not found
*/
package arrays;
public class LinearSearch
{
    //Method to perform the linear search
    public static int linearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;//return index if found
            }
        }
        return -1; //return -1 if not found
    }
    //Main method to test the functions
    public static void main(String[] args)
    {
        //Declaration and Initialisation of an 1-D array
        int []arr={1,7,4,3,8,2};
        int key=2;//Value to search

        int index=linearSearch(arr,key);

        if(index!=-1)
        {
            System.out.println("Element " + key + "found at index: " + index);
        }
        else
        {
            System.out.println("Element "+ key+" not found in the array");
        }
    }
}
