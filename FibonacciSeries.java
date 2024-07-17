import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int Fib=Fibonacci(num);
        System.out.println(Fib);
    }

    public static int Fibonacci(int num) {
        int result=0;
        if(num<=1)
        {
            return num;
        }
        else{
            result=Fibonacci(num-1)+Fibonacci(num-2);
        }
        return result;
    }
}
