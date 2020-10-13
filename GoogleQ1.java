import java.util.*;
/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
*/
public class GoogleQ1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashSet<Integer> h=new HashSet<Integer>();
		System.out.print("Enter value of k:");
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(h.contains(k-arr[i]))
				flag=true;
			h.add(arr[i]);
		}
		System.out.print(flag);



	}
}