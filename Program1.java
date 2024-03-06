import java.util.*;
class Program1
{
	public static void test(int n,int m,int k)
	{
		System.out.println("Argumets First " +n+ "," +m+ "," +k);
	}
	public static void test(int i,int j)
	{
		System.out.println("Arguments Second " +i+ "," +j);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Values for method overloading");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		test(a,b,c);
		test(a,b);
		
	}
}