import java.util.Scanner;

class FactProgram
{
	public static int FactorialNum(int num)
	{
		int result;
		if(num==0||num==1)
            return 1;
		else result = num * FactorialNum(num - 1);
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for Factorial :");
		int num=sc.nextInt();
		int result=FactorialNum(num);
		System.out.println(result);
	}
}