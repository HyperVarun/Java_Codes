/*Q3. Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.

Input 8, Even
3, False */

import java.util.Scanner;

public class EvenBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check number is even or not ");
        int n = sc.nextInt();
        boolean even = false;
        if ((n & 1) == 0) {
            even = true;
            System.out.println(even);
        } else {
            System.out.println(even);
        }
    }
}
