import java.util.*;
// Other imports go here
// Do NOT change the class name and method signature
public class HappyNumber
{
  static boolean isHappy(int n) 
  {
    int digit,sum=0;
    boolean truth;
    HashSet<Integer> set=new HashSet<Integer>();
    while(true)
    {
    while(n>0)
    {
     digit=n%10;
     sum=sum+(int)(Math.pow(digit,2));
      n=n/10;
    }
      if(sum==1)
        return true;
    truth=set.add(sum);
      if(truth==false)
      {
        return false;
      }
      n=sum;
      sum=0;
    }
    // Write your code here
  }
  public static void main(String[] args)
{
  int t;
  Scanner s=new Scanner(System.in);
  t=s.nextInt();
  if(isHappy(t))
    System.out.println("1");
  else
    System.out.println("0");
}
}