//Write a program in java to delete all consonants from the string "Hello, have a good day"

import java.util.*;

class Program16
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		System.out.println(str.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz]","")); 
		
	}
}