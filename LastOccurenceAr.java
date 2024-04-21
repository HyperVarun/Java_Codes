/*
 * Q2. Given an array and an integer “target”, return the last occurrence of
 * “target” in the array. If the target is not present return -1.
 * 
 * Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
 * Output 1: 6
 * 
 * Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
 * Output 2: -1
 */

import java.util.Scanner;

class LasrOccurenceAr {
    public static int OccurenceArray(int arr[], int x) {
        int n = arr.length;
        int low = arr[0];
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
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
        // int n = array.length;
        System.out.println("Enter the target value for given array: ");
        int x = sc.nextInt();
        int result = OccurenceArray(array, x);
        if (result == -1) {
            System.out.println("Element not found in array: " + result);
        } else {
            System.out.println("Element found in array: " + result);
        }
    }
}