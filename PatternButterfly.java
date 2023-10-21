import java.util.*;
class pat
{
  public static void main(String aa[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter maximum bound: ");
    int n=sc.nextInt();
    //upper half
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      int s=2*(n-i);
      for(int j=1;j<=s;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    //lower half
    for(int i=n;i>=1;i--)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      int s=2*(n-i);
      for(int j=1;j<=s;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}

