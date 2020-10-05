class commonelements
{
	public static void main(String args[])
	{
		int[] arr1={2,4,8};
		int[] arr2={2,3,4,8,10,16};
		int[] arr3={2,8,10,40};
		int[] temp=new int[50];
		int i,j;
		for(i=0;i<arr1.length;i++)
		{
			temp[arr1[i]]=temp[arr1[i]]+4;
		}
		for(i=0;i<arr2.length;i++)
		{
			temp[arr2[i]]=temp[arr2[i]]-2;
		}
		for(i=0;i<arr3.length;i++)
		{
			temp[arr3[i]]=temp[arr3[i]]-2;
		}
		for(i=0;i<arr1.length;i++)
		{
			if(temp[arr1[i]]==0)
			{
				System.out.print(arr1[i]+" ");
				temp[arr1[i]]=0;
			}
		}
	}
}