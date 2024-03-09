import java.util.*;
class Program8
{
	public static String sortString(String str)
	{
		char tempArray[]=str.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}
	public static void main(String args[])
	{
		String str="PW Skills Java";
		String outputString= sortString(str);
		
		System.out.println("Input String " +str);
		
		System.out.println("Output String" +outputString);
		
		
	}
}