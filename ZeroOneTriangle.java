import java.util.*;
class pat
{
	public static  void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter maximum level: ");
	  int n = sc.nextInt();
	  System.out.println("The 0-1 triangle is: ");
		for(int i=1;i<=n;i++)
		{
		  for(int j=1;j<=i;j++)
		  {
		    if((i+j)%2==0)
		    {
		      System.out.print("1 ");
		    }
		    else
		    {
		      System.out.print("0 ");
		    }
		  }
		  System.out.println();
		}
	}

}
