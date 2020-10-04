import java.util.*;
class Book
{
	
	String book_name;
	String book_title;
	int book_price;
	int bookid;
	static void welcome()
	{
		System.out.println("Welcome to library");
	}
	public void get(String name,String title,int price,int id)
	{
		book_name=name;
		book_title=title;
		book_price=price;
		bookid=id;

	}
	public void print(int id,String name)
	{
		System.out.print(name+" "+id);

	}
	public static void main(String args[])
	{
		
		welcome();
		Book ob1=new Book();
		ob1.get("c++","reema thareja",1200,12);
		ob1.print(12,"c++");



	}
}