class deletelement
{
	public static void main(String arsg[])
	{
		int []arr={10,40,30,80,60,20};
		int value=30,i,pos=0;
		for(i=0;i<arr.length;i++)
		{
			if(value==arr[i])
			{
				pos=i;
			}
		}
		for(i=pos;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		for(i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}
}