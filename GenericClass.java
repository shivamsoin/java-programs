class A<E>
{
E a;
public A(E a)
{
	this.a=a;
}
public void print()
{
	System.out.println(a);
}
}
class GenericClass
{
	public static void main(String args[])
	{
		Integer a=12;
		String b="name";
		A <Integer> obj=new A <Integer> (a);
		A <String> obj2=new A <String> (b);
		obj.print();
		obj2.print();
	}
}
