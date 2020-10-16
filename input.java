import java.util.*;
class input
{
public static void main(String[] args)
{
Scanner a=new Scanner(System.in);
System.out.print("enter your name:");
String name= a.nextLine();
System.out.print("\nenter your marks:");
int i=a.nextInt();
System.out.print("\n"+name+" got "+i+" marks!");
}
}