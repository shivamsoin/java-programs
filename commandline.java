class commandline
{
	public static void main(String args[])
	{
		int pr=0;
		
		for(String st:args)
		{
			pr=pr+Integer.parseInt(st);
	
		}
		
		System.out.println(pr);
	}
}