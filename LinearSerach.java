//Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
//else print “Element not found in array”. Input the size of array, array from user and the element X from user.
//Use Linear Search to find the element.

import java.util.*;
import java.io.*;

public class LinearSerach {
    public static int ArrayLinearSearch(int arr[], int x) {
        int result = -1;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number to find the value : ");
        int tar = sc.nextInt();
        int result = ArrayLinearSearch(array, tar);
        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found in array: " + result);
        }
    }

}
