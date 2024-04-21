/*Q3. WAP to sort an array in decreasing order using insertion sort

Input Array {3,5,1,6,0}

Output Array: {6, 5, 3, 1, 0}*/

import java.util.*;
import java.io.*;

public class InsertionSort {

    public static void desInsertion(int arr[]) {
        int n = arr.length;
        int j, temp;

        for (int i = 1; i < n; i++) {
            j = i;
            while (j > 0 && arr[j] > arr[j - 1]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        desInsertion(array);

        System.out.println("Sorted array in descending format :");
        System.out.println(Arrays.toString(array));
    }

}
