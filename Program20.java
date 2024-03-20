//Write a program to call an method without creating an object of a class

class acc
{
	static String name="Irfan";
	static void call()
	{
		System.out.println(name);
	}
}
class Program20
{
	public static void main(String args[])
	{
		acc.call();
	}
	
}