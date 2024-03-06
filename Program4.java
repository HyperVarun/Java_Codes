import java.util.*;
class FindIndex
{
	public int Index(int arr[], int element)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				return i;
			}
		}
		return -1;
	}
}
class Program4
{
	public static void main(String args[])
	{
		FindIndex obj=new FindIndex();
		Scanner sc= new Scanner(System.in);
		int arr[]={1,2,3,5,4,6,9};
		System.out.print("Eneter the index value ");
		int element=sc.nextInt();
		int i=obj.Index(arr,element);
		if(i != -1)
		{
			System.out.println("The element is at index " + i);
		}
		else
		{
			System.out.println("The element is not in the array ");
		}
	}
}