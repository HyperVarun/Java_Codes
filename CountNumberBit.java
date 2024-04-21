/*Q4. Given a number, count the number of set bits in that number without using an extra space.

Note : bit ‘1’ is also known as set bit. */

import java.util.Scanner;

public class CountNumberBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        System.out.println(count);
    }
}