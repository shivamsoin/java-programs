import java.util.Scanner;
import java.util.regex.*;
// Other imports go here
// Do NOT change the class name
class EmailValidation
{
  public static void main(String[] args)
  {
    String id;
    Scanner s1=new Scanner(System.in);
    id=s1.nextLine();
    try
    {
    	if(Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-z]{2,10}",id))
    	{
    		throw new Abc("Valid");
    	}
    	else
    	{
    		throw new Abc("Invalid");
    	}
    }
    catch(Abc e)
    {
    	System.out.print(e.getMessage());
    }
  }
}
class Abc extends Exception
{
	public Abc(String msg)
	{
		super(msg);
	}
	
}