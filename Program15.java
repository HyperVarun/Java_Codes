//Question 6: Write a program to check if the letter 'e' is present in the word "Umberlla"

import java.util.*;

class Program15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		boolean isEPresent=false;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e')
			{
				isEPresent=true;
				break;
			}
		}
		if(isEPresent)
		{
			System.out.println("The letter e is present in the String");
		}
		else
		{
			System.out.println("The letter e is not present in the String");
		}
	}
}