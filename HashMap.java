import java.util.*;
class Author
{ int id;
  String name;
public Author(int id,String name)
{
	this.id=id;
	this.name=name;
}
}
public class HashMap
{
	public static void main(String args[])
	{
		Author a1=new Author(123,"om");
		Author a2=new Author(124,"ram");
		Hashtable<Integer,Author> hash=new Hashtable<Integer,Author>();
		hash.put(1,a1);
		hash.put(2,a2);
		for(Map.Entry<Integer,Author> k:hash.entrySet())
		{
			int nu=k.getKey();
			Author b=k.getValue();
			System.out.println(nu+".");
			System.out.println("id: "+b.id+"name:"+b.name);
		}
	}
}