import java.util.*;
class BadException extends RuntimeException
{
	BadException(String msg)
	{
		super(msg);
	}
}
class CalculateSalary
{
int salary;
int right;
int wrong=17250;
boolean value=false;
CalculateSalary(int a)
{
	this.salary=a;
}
public void right()
{
right=salary+(salary*15/100);
}
public void rightt()
{
	if(value==false)
	System.out.println("salary is:"+right);
    else
    {
    	System.out.print("You calculated:"+wrong+"\nright salary is:"+right);
    }

}
public void wrong()
{
try
{
if(wrong!=right)
{
	value=true;
	throw new BadException("Sorry bro your maths is not good!");
}
else
{
value=false;
}
}
catch(BadException e)
{
	System.out.println(e.getMessage());
}
}
}
public class CustomException
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter salary:");
		int salary=sc.nextInt();
		CalculateSalary obj=new CalculateSalary(salary);
		obj.right();
		obj.wrong();
		obj.rightt();

	}
}