import java.util.*;
class Book
{
	String name;
	int id;
	String author;
	public Book(String name,int id,String author)
	{
		this.name=name;
		this.id=id;
		this.author=author;
	}
	public String toString()
	{
		return name+" "+id+" "+author;

	}
}
public class ArrayListt
{
	public static void main(String[] args) {
		Book b1=new Book("abc",1,"reema");
		Book b2=new Book("def",2,"rl stine");
		Book b3=new Book("efg",3,"david");
		ArrayList <Book> obj=new ArrayList <Book> ();
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	} 
}