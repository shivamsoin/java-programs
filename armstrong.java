import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		int c,d,rem,sum=0;
		armstrong ob=new armstrong();
		Scanner a=new Scanner(System.in);
		System.out.print("enter number:");
		int b=a.nextInt();
		c=b;
		d=ob.digits(b);
		while(b>0)
		{
			rem=b%10;
			sum=sum+(int)(Math.pow(rem,d));
			b=b/10;
		}
		System.out.println(sum);
		if(sum==c)
		{
			System.out.print("armstrong!!");
		}
		else
		{
			System.out.print("not armstrong!!");
		}
		
		
		
	}
	int digits(int a)
	{
		int c=0;
		while(a>0)
		{
			c++;
			a=a/10;
		}
		return c;
		
	}
}
