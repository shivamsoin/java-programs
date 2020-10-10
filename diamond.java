import java.util.*;
public class diamond
{
	public void one(int a,int k,int middle)
	{
		int z=a%2;
		if(a==0)
		{
			System.out.print("<>");
		}
		else
		{
		if(z==0)
		{
			if(a==middle)
				System.out.print("<");
			else
			    System.out.print("/");
		    for(int j=0;j<k;j++)
		    System.out.print("=");
		    if(a==middle)
		    	System.out.print(">");
		    else
		        System.out.print("\\");
		}
		else
		{
			if(a==middle)
				System.out.print("<");
			else
			    System.out.print("/");
		    for(int j=0;j<k;j++)
		    System.out.print("-");
		    if(a==middle)
		    	System.out.print(">");
		    else
		        System.out.print("\\");
		}
	}
	}
	public void start(int n)
	{
		System.out.print("+");
		for(int i=0;i<2*n;i++)
		{
			System.out.print("-");
		}
		System.out.println("+");
	}
	public void space(int middle,int i)
	{
		for(int j=middle;j>i;j--)
		System.out.print(" ");
	}
	public static void main(String args[])
	{
		diamond obj=new diamond();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int size=n-1,middle=n-1,k=2,h=0,i;
		obj.start(n);
		for(i=0;i<size;i++)
		{
			System.out.print("|");
			obj.space(middle,i);
		    if(i%2==0&&i!=0)
		    {
		    	obj.one(i,k,middle);
		    	k=k+2;
		    }
		    if(i==0)
		    	System.out.print("/\\");
		    if(i%2==1)
		    {
		    	obj.one(i,k,middle);
		    	k=k+2;
		    }
		    obj.space(middle,i);
			System.out.print("|");
			System.out.println();	
		}
		System.out.print("|");
		obj.one(i,k,middle);
		System.out.print("|");
		



	}
}