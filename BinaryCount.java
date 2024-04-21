
/*Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.

Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
Output 1: 6

Input 2: arr = [ 0 0 0 0 0 1 1]
Output 2: 2 */
import java.util.*;

public class BinaryCount {
    public static int CountBiArray(int arr[]) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
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
        int result = CountBiArray(array);
        if (result == 0) {
            System.out.println("Binary array don't have 1's in the given array ");
        } else {
            System.out.println("Binary array count of 1's in the given array: " + result);
        }
    }

}
