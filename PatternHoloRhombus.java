import java.util.*;
class pat
{
	public static void main(String args[])
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
		    if(i==1||j==1||i==n||j==n)
		    {
		      System.out.print("*");
		    }
		    else
		    {
		      System.out.print(" ");
		    }
		  }
		  System.out.println();
		}
	}

}
