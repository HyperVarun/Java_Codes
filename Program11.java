//WAP in java to find the index value of substring

import java.util.*;

class Program11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		System.out.println("Enter the substring :");
		String sub=sc.nextLine();
		
		int index=str.indexOf(sub);
		
		if(index==-1)
		{
			System.out.println("The substring is not found");
		}
		else
		{
			System.out.println("The index of the substring : " +index);
		}
		
	}
}


