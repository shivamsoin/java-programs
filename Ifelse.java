import java.util.*;
class Ifelse
{
	public static void checkodd()
	{
		Scanner a=new Scanner(System.in);
		System.out.print("enter number:");
		int b=a.nextInt();
		if(b%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}
	public static void checksign()
	{
		Scanner a=new Scanner(System.in);
		System.out.print("enter number:");
		int b=a.nextInt();
		if(b>0)
			System.out.println("Positive number");
		else
			System.out.println("Negative number");

	}
	public static void largest()
	{
		Scanner a=new Scanner(System.in);
		System.out.print("enter first number:");
		int q=a.nextInt();
		System.out.print("enter second number:");
		int w=a.nextInt();
		System.out.print("enter third number:");
		int e=a.nextInt();
		System.out.print("enter fourth number:");
		int r=a.nextInt();
		System.out.print("enter fifth number:");
		int t=a.nextInt();
		if(q>w&&q>e&&q>r&&q>t)
			System.out.println(q+" is the largest");
		else if(w>q&&w>e&&w>r&&w>t)
			System.out.println(w+" is the largest");
		else if(e>w&&e>q&&e>r&&e>t)
			System.out.println(e+" is the largest");
		else if(r>q&&r>w&&r>e&&r>t)
			System.out.println(r+" is the largest");
		else
			System.out.println(t+" is the largest");
		

	}

	public static void main(String args[])
	{
		checkodd();
		checksign();
		largest();
	}
}
