//program for alternate sum of series
// number =10  (-10+9-8+7-6+5-4+3-2+1)== -5
// problem solve is when number is even take as -num and when number is odd then take as (num-1)


import java.util.Scanner;

public class AlternateSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for alternative sum series :");
        int num=sc.nextInt();
        int result=AlternativeSumFind(num);
        System.out.println("Total number of sum in the series : " +result);
    }

    public static int AlternativeSumFind(int num) {

        int result=0;
        if(num==0)
            return 0;
        if(num%2==0)
            result=AlternativeSumFind(num-1)-num;
        else
            result=AlternativeSumFind(num-1)+num;

        return result;
    }
}
