//WAP in java to know whether the given string is palindrome

import java.util.*;

class Program12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		boolean isPalindrome=true;
		
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
			{
				isPalindrome=false;
				break;
			}
		}
		
		if(isPalindrome)
		{
			System.out.println(str+ " is a palindrome");
		}
		else
		{
			System.out.println(str+ " is not a palindrome");
		}
	}
}