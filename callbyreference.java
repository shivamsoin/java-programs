import java.util.*;
class callbyreference
{
	int x;
	callbyreference(int x)
	{
		this.x=x;
	}
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		callbyreference ob1=new callbyreference(10);
		callbyreference ob2=new callbyreference(20);
		System.out.println(ob1.x+" "+ob2.x);
		swapp(ob1);
		System.out.print(ob1.x+" "+ob2.x);




	}
	public static void swapp(callbyreference ob)
	{
		ob.x=20;
		System.out.println(ob.x);
	}
}