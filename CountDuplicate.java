/*Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element is not found in the array, report that as well.

Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 5
Output: Target 5 occurs 3 times

Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 6
Output: Target 6 occurs 2 times */

import java.util.Scanner;

public class CountDuplicate {
    public static int Duplicatecount(int arr[], int x) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
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
        System.out.println("Enter the count element :");
        int x = sc.nextInt();

        int result = Duplicatecount(array, x);

        if (result == 0) {
            System.out.println("Enter is not found in the iven array:");
        } else {
            System.out.println("Taget " + x + " ocurrs " + result + " times.");
        }
    }
}
