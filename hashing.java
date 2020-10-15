class hashing
{
	public static void main(String args[])
	{
		int[] arr={12,10,52,12,12,10};
		int[] temp=new int[100];
		int i;
		for(i=0;i<arr.length;i++)
		{
			temp[arr[i]]=temp[arr[i]]+1;
		}
		for(i=0;i<arr.length;i++)
	{
	 if(temp[arr[i]]>=1)
	 {
	 	System.out.println(arr[i]+":"+temp[arr[i]]);
	 	temp[arr[i]]=0;
	 }
	}

	}
}