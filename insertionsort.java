class insertionsort
{
	public static void main(String args[])
	{
		int[] a={5,1,6,2,4,3};
		int i,j,value;
		
			for(i=1;i<a.length;i++)
			{
				value=a[i];
				j=i;
				while(j>0&&a[j-1]>value)
				{
					a[j]=a[j-1];
					j--;
				}
				a[j]=value;
			}
			for(int k:a)
				System.out.print(k+" ");
		

	}
}