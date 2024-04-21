
/*Q2. WAP to sort an array in descending order using selection sort

Input Array {3,5,1,6,0}

Output Array: {6, 5, 3, 1, 0}
 */
import java.util.*;
import java.io.*;

public class SelectionSort {
    public static void desSelection(int arr[]) {
        int n = arr.length;
        int i, j, temp;
        for (i = 0; i < n; i++) {
            int mid_inx = i;
            for (j = i + 1; j < n - 1; j++) {
                if (arr[j] > arr[mid_inx]) {
                    mid_inx = j;
                }
                temp = arr[mid_inx];
                arr[mid_inx] = arr[i];
                arr[i] = temp;
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
        desSelection(array);

        System.out.println("Sorted array in descending format :");
        System.out.println(Arrays.toString(array));
    }

}
