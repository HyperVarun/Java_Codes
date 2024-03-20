//Write a program and create a constructor with parameters and initialise the variable using a constructor.

class cal
{
	private int a;
	private int b;
	cal(int m,int n)
	{
		this.a=m;
		this.b=n;
	}
	void disp()
	{
		System.out.println(a+" "+b);
	}
}

class Program18
{
	public static void main(String args[])
	{
		cal obj=new cal(2,6);
		obj.disp();
	}
}