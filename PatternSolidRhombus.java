import java.util.*;
class pat
{
  public static void main(String yy[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter maximum bound: ");
    int n = sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  
  }

}
