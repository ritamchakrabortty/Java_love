import java.util.*;
class forloop
{
  void show()
  {
    for(int i=0;i<100;i++)
    {
      System.out.println("Hello World!");
    }
  }
}
class printthenumberfromZerotoTen
{
  void show1()
  {
    for(int i=0;i<11;i++)
    {
      System.out.printf("%d ",i);
    }
    System.out.println("    ");
  }
}
class whileloop
{
  void show2()
  {
    int i=0;
    while(i<500)
    {
      System.out.println("Hello Java!");
      i++;
    }
  }
}
class dowhileloop
{
  void show3()
  {
    int i=0;
    do{
      System.out.println("Github!");
      i++;
    }while(i<56);
  }
}
class falseloop
{
  void show4()
  {
    int i=12;
    while(i<11)
    {
      System.out.println("Biriyani!"); //This will not print. 
    }
    do {
      System.out.println("Biriyani!"); //This will print the statement once.
    }while(i<11);
  }
}
class PrintTheSumOfFirstNNaturalNumbers
{
  void disp()
  {
      int sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of N:");
      int n = sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        sum=sum+i;
      }
      System.out.println("The sum of first N natural numbers is: ");
      System.out.println(sum);
  }
}
class table
{
  void disp1()
  {
    Scanner ss = new Scanner(System.in);
    System.out.println("Enter the number for printing its table:");
    int k = ss.nextInt();
    for(int i=1;i<11;i++)
    {
      System.out.println(k+"*"+i+"="+k*i);
    }
  }
}

class print
{
  public static void main(String aa[])
  {
    forloop ob = new forloop();
    printthenumberfromZerotoTen ob1 = new printthenumberfromZerotoTen();
    whileloop on = new whileloop();
    dowhileloop oj = new dowhileloop();
    falseloop obn = new falseloop();
    PrintTheSumOfFirstNNaturalNumbers og = new PrintTheSumOfFirstNNaturalNumbers();
    table kl = new table();
    ob.show();
    ob1.show1();
    on.show2();
    oj.show3();
    obn.show4();
    og.disp();
    kl.disp1();
  }
}
