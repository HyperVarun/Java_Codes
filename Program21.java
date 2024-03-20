//Write a program which has static block and maintructor overloading,initialise variables using maintructors and print it

class main	
{
	private String name;
	private int age;

	static
	{
		System.out.println("this is a static block");
	}
	public main()
	{
		System.out.println("Zero parametrized maintructor by programmer");
		System.out.println(name+" "+age);
	}
	public main(String name, int age)
	{	
		this.name=name;
		this.age=age;
		System.out.println("This is the parameterized constructor.");
	}
	public void disp2()
	{
		System.out.println(name+" "+age);
	}
	
}
class Program21
{
	public static void main(String args[])
	{
		main obj=new main();
		main obj2=new main("Rahul",25);
		obj2.disp2();
	}
}