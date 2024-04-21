
import java.util.*;
import java.io.*;

public class DigaonalbothArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the array martix:");
        int row = sc.nextInt();
        System.out.println("Enter the column of the array martix:");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j == i && j + i < column - 1) {
                    System.out.println(array[i][j] + " ");
                }
            }

        }
        // System.out.println();3

    }

}
