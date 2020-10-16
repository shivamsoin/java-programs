import java.util.*;
class insertelement
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		int arr[]=new int[10];
		int i;
		for(i=0;i<5;i++)
		{
			arr[i]=a.nextInt();

		}
		System.out.print("enter position:");
		int pos=a.nextInt();
		System.out.print("enter value:");
		int value=a.nextInt();
		
		for(i=5;i>=pos;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos-1]=value;
		for(int k:arr)
		{
			System.out.print(k+" ");
		}
		

	}
}