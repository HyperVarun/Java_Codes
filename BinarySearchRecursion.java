import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number for search in the array : ");
        int x=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        int result=BinarySearch(arr,low,high,x);
        System.out.println("The array element is at index :" +result);
    }

    public static int BinarySearch(int[] arr, int low, int high, int x) {
        // if element is not present in an array
        int result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]<x)
            {
                //traverse towards right side
                return BinarySearch(arr,mid+1,high,x);
            }
            else {
                //traverse towards left side
                return BinarySearch(arr, low, mid - 1, x);
            }
        }
        return result;

    }
}
