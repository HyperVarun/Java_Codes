//Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
//of every digit in that number raised to the power of total digits in that number is equal to the number.

import java.util.Scanner;


public class ArmstrongNumber {

    // Method to calculate the number of digits in a number
    public static int countDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countDigits(number / 10);
    }

    // Recursive method to calculate the sum of the digits raised to the power of the number of digits
    public static int sumOfPower(int number, int power) {
        if (number == 0) {
            return 0;
        }
        int digit = number % 10;
        return (int) Math.pow(digit, power) + sumOfPower(number / 10, power);
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int digits = countDigits(number);
        int sum = sumOfPower(number, digits);
        return sum == number;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check number is ArmStrong Number or not :");
        int number = sc.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number: " + true);
        } else {
            System.out.println(number + " is an Armstrong number: " + false);
        }
    }
}
