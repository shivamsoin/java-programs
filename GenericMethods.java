class A
{
	public <E> void cal(E[] a)
	{
		for(E k:a)
		System.out.print(k+" ");
	}
}
class GenericMethods
{
	public static void main(String args[])
	{
		A obj=new A();
		Integer[] a={1,2,3,4};
		String []s={"my","name","is","om"};
		Double d[]={1.0,2.0,3.0};
		obj.cal(a);
		obj.cal(s);
		obj.cal(d);
	}
}