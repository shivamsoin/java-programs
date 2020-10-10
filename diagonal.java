import java.util.*;
class diagonal
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner a=new Scanner(System.in);
		for(i=1;i<=5;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.println("*");

		}
		System.out.print("\n\n\n");
		for(i=1;i<=5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			System.out.println("*");

		}

	}
}