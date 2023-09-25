//different types to print and taking inputs handling variables
import java.util.*;
class r
{
	public static void main(String aa[])
	{
		System.out.println("Hello World in java");
		System.out.print("Hello World in java\n");
		System.out.print("Hello World in java\nRitam Chakrabortty don't know java.");
		System.out.println(" ");
		/*Printing the following pattern with the help of print statement only:
		*
		**
		***
		****
		*/
		System.out.print("*\n**\n***\n****\n");
		//variables
		String name = "Ritam";
		System.out.println(name);
		int a = 25;
		int b = 10;
		int sum = a*b;
		System.out.println(sum);
		int age = 21;
		double price = 87.50;
		
		b = 20;
		int sum1 = a*b;
		System.out.println(sum1);
		name = "Chakrabortty";
		System.out.println(name);
		a=10;
		b=5;
		int ans = a * b / a - b;
		int ans1 = (a * b) / (a - b);
		System.out.println(ans);
		System.out.println(ans1);
		//Input
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		  int v = sc.nextInt();
		  int x = sc.nextInt();
		  int y =v+x;
		  System.out.println(y);
		System.out.println(name1);
		
		
	}
}
