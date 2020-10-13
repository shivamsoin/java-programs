class frequency2
{
	public static void main(String args[])
	{
		 int[]arr={1,5,4,1,5,5};
		 int[]temp=new int[6];
		 int i,j,count=1;
		 for(i=0;i<temp.length;i++)
		 {
		 	temp[i]=-1;
		 }
		 for(i=0;i<arr.length;i++)
		 {
		 	count=1;
		 	for(j=i+1;j<arr.length;j++)
		 	{
		 		if(arr[i]==arr[j])
		 			{temp[j]=0;
		 		count++;
		 	}
		 	}
		 	if(temp[i]!=0)
		 	temp[i]=count;
		 }
		 for(i=0;i<arr.length;i++)
		 {
		 	if(temp[i]!=0)
		 		System.out.println("frequency of "+arr[i]+"is"+temp[i]);
		 }

	}
}