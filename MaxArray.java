// write a program to print max value in the array


import java.util.Scanner;

public class MaxArray {
    public static  int finMaxValue(int arr[],int n)
    {
        int max=arr[0];
        if(n==1)
        {
            return arr[0];
        }
        else {
            return Math.max(arr[n-1],finMaxValue(arr,n-1));
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        int maxValue=finMaxValue(array,size);
        System.out.println("The max value in the Array is : "+maxValue);
    }
}
