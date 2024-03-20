//.Use a private keyword for a variable and use setter and getter methods to initialise and print the values.


class main
{
	private String name;
	private int b;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int b)
	{
		this.b=b;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return b;
	}
}
class Program19
{
	public static void main(String args[])
	{
		main obj=new main();
		obj.setAge(18);
		obj.setName("Pradeep");
		
		String name=obj.getName();
		System.out.println(name);
		int age=obj.getAge();
		System.out.println(age);
	}
}