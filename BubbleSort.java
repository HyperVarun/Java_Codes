
/*Q1. Write a program to sort an array in descending order using bubble sort.

Input Array {3,5,1,6,0}
Output Array: {6, 5, 3, 1, 0} */
import java.util.*;

public class BubbleSort {

    public static void descBubble(int arr[]) {
        int n = arr.length;
        // int result = -1;
        boolean swap;
        for (int i = 0; i < n; i++) {
            swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
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

        descBubble(array);

        System.out.println(Arrays.toString(array));
    }
}
