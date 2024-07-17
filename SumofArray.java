//write a program Find the sum of the values of the array

import java.util.Scanner;

public class SumofArray {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        int sum=findsumArray(array,0);
        System.out.println("Sum of the given array is : " +sum);

    }

    public static int findsumArray(int[] array, int index) {
        int sum=0;
        if(index==array.length)
        {
            return 0;
        }
        else
        {
            return array[index]+findsumArray(array,index+1);
        }

    }
}
