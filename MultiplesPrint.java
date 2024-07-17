//print multiples by using Recursion
//function C1=n*k


import java.util.Scanner;

public class MultiplesPrint {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for multiples :");
        int n=sc.nextInt();
        System.out.println("Enter the number for print times : ");
        int k=sc.nextInt();
        System.out.println("The multiples of print is : ");
        printMulti(n,k);
    }

    public static void printMulti(int n, int k) {

        if(k==1) {
            System.out.println(n);
            return;
        }
        printMulti(n,k-1);
        System.out.println(n*k);
    }
}
