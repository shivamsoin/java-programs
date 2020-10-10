class duplicates
{
	public static void main(String args[])
	{
		int[] arr={3,5,4,3,2,2,1};
		int[] temp=new int[50];
		int i,j=0,first=0;
		System.out.print("duplicates elements are:");
		for(i=0;i<arr.length;i++)
		{
			temp[arr[i]]=temp[arr[i]]+1;
		}
		for(i=0;i<arr.length;i++)
		{
			if(temp[arr[i]]>=2)
			{
				if(j==0)
				{
					first=arr[i];
				}
				System.out.print(arr[i]+" ");
				temp[arr[i]]=0;
				j++;
			}
		}
		System.out.print("\nfirst duplicate element is:"+first);
	}
}