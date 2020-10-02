import java.util.*;
public class AlternativeMerge
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer a=new StringBuffer();
		System.out.print("Enter String 1:");
		a.append(sc.nextLine());
		StringBuffer b=new StringBuffer();
		System.out.print("Enter String 2:");
		b.append(sc.nextLine());
		int i,j=1;
		if(a.length()>b.length())
		{
		for(i=0;i<b.length();i++)
		{
		    a.insert(j,b.charAt(i));
		    j=j+2;
		}
		System.out.print("\n"+a);
	}
	else
	{
		j=0;
		for(i=0;i<a.length();i++)
		{
         b.insert(j,a.charAt(i));
         j=j+2;
		}
		System.out.print("\n"+b);
	}
}
}