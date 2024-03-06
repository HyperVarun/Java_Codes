class calc
{
	public int add(int nums[])
	{
		int result=0;
		for(int n:nums)
		{
			result=result+n;
		}
		return result;
	}
}
class Program3
{
	public static void main(String args[])
	{
		calc obj=new calc();
		int nums[]={5,6,4,8};
		int result=obj.add(nums);
		System.out.println(result);
	}

}