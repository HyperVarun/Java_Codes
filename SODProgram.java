
//program for SUM of digits

import java.util.Scanner;

public class SODProgram {

    public static int SumofDigits(int num)
    {
        int rem=0;
        if(num==0)
        {
            return 0;
        }
        else {
            rem=num%10+SumofDigits(num/10);
        }
        return rem;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for sum of digits:");
        int num=sc.nextInt();
        int sum=SumofDigits(num);
        System.out.println("The sum of digits is : " +sum);
    }

}
