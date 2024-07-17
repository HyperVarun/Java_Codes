
/*Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even
number of times except one which appears an odd number of times. Find that odd appearing
element in linear time and without using any extra memory.
For example,

Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
Output : The odd occurring element is 4. */
import java.io.*;
import java.util.*;

public class OddCountNumberBit {

    public static int CountOdd(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }

        }
        return count;
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

        int result = CountOdd(array);
        if (result == 0) {
            System.out.println("The odd occurring is not found in the given array");

        } else {
            System.out.println("The odd occurring element is: " + result);
        }

    }
}
