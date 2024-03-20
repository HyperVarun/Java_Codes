//Create a class that keeps track of the number of instances created. Implement a static variable and method to accomplish it


class ObjCount
{
	private static int count=0;
	
	public ObjCount()
	{
		count++;
	}
	public static int getCount()
	{
		return count;
	}
	
	public static void main(String args[])
	{
		ObjCount obj=new ObjCount();
		ObjCount obj2=new ObjCount();
		ObjCount obj3=new ObjCount();
		
		System.out.println(getCount());
	}
}