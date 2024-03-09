//Write a java program to remove a particular character from a String.


import java.util.*;
class Program10
{
	public static String RemoveCharacter(String str, char ch)
	{
		char[] charArray=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(char c: charArray)
		{
			if(c!=ch)
			{
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		System.out.println("Enter the character you want to remove");
		char ch=sc.next().charAt(0);
		
		String resultString=RemoveCharacter(str,ch);
		
		System.out.println("String after removing "+ch+ ":" +resultString);
	}
}