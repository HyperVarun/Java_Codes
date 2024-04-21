//write a program to print the elements above the secondary diagonal in a user inputted square matrix.

import java.util.*;

public class DigaonalSecArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array martix:");
        int size = sc.nextInt();
        // System.out.println("Enter the column of the array:");
        // int column = sc.nextInt();
        int[][] array = new int[size][size];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j < size - 1) {
                    System.out.println(array[i][j] + " ");
                }
            }

        }
        System.out.println();

    }

}
