import java.util.*;
class egx
{
 // Write your code here
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
int r,j,k;
int[] rr=new int[200];
  r=sc.nextInt();
for(k=0;k<r;k++)
  rr[k]=sc.nextInt();
int[][] arr=new int[r][];
for(k=0;k<r;k++)
  arr[k]=new int[rr[k]];
for(k=0;k<arr.length;k++)
{
  for(j=0;j<arr[k].length;j++)
  {
    arr[k][j]=sc.nextInt();
  }
}
for(k=0;k<arr.length;k++)
{
  for(j=0;j<arr[k].length;j++)
  {
    System.out.print(arr[k][j]+" ");
  }
  System.out.println();
  
}
}
}

