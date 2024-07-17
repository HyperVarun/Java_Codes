//        Program for Finding Power of the any number by using recursion method with
//                optimizied approach using divide and conquer method as well


import java.util.Scanner;

public class FindingPowerRecursion {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
      //  int a=sc.nextInt();
        long a=sc.nextInt();
        System.out.println("Enter the power of the number");
        //int b=sc.nextInt();    int has 32-bit if problem statements is greater than 32-bit then we go for long datatype
        long b= sc.nextLong();
        long result=PowerofElements(a,b);;
        //int result=PowerofElements(a,b);
        System.out.println("Power of "+a+"^"+b+ " is : "+result);
    }

    public static long PowerofElements(long a, long b) {
        long result=0,mid=0;
        long finalResult=0;
        if(b==1)
        {
            return a;
        }
        else
        {
            mid=b/2;
            result = PowerofElements(a,mid);
            finalResult=result*result;
            if(b%2==0)

            {
                return finalResult;
            }
            else {
                return a*finalResult;
            }
        }

    }
}
