/*Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer. */

import java.util.Scanner;

class SquareRootArray {
    public static boolean isPerfectSquare(int num) {
        int low = 0, high = num / 2;
        if (num == 1) {
            return true;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = mid * mid;
            if (val == num) {
                return true;
            } else if (val < num) {
                low = mid - 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root:");
        int nums = sc.nextInt();

        // int result = findSquareRoot(nums);

        System.out.println("The given number is a perfect square: " + isPerfectSquare(nums));
    }
}