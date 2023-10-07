import java.util.*;
class pat
{
	public static void main(String adrija[])
	{
		for(int i=1;i<=50;i++)
		{
			for(int j=1; j<=50-i;j++)
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
