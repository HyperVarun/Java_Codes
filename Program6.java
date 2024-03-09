class Program6
{
	public static void main(String args[])
	{
		/*String str="PWSKILLS", nstr=" ";
		char ch;
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println(nstr);*/
		
		StringBuilder str = new StringBuilder("PWSKILLS");
		System.out.println(str);

		System.out.println(str.reverse());
		
	}
}