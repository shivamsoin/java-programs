import java.util.*;
class crosspatt
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i==j||(i+j)==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}
}