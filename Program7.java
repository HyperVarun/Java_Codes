class Program7
{
	public static void main(String args[])
	{
		String str="think twice", nstr=" ", mstr=" ";
		char ch;
		System.out.println(str);
		for(int i=0;i<str.length()/2;i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.print(nstr);
		for(int j=str.length()/2;j<str.length();j++)
		{
			ch=str.charAt(j);
			mstr=ch+mstr;
		}
		System.out.print(mstr);
		
		
	}
}