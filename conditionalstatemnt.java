//conditional statement
import java.util.*;
  class Oddeven
  {
    void check()
    {
      Scanner ty = new Scanner(System.in);
      System.out.println("Enter a no to check odd or even: ");
      int n = ty.nextInt();
      if(n%2==0)
      {
        System.out.println("Entered no is even.");
        
      }
      else
      {
        System.out.println("Entered no is odd.");
      }
    }
  }
  class Great
  {
    void check1()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two numbers to compare: ");
      int t = sc.nextInt();
      int u = sc.nextInt();
      if(t==u)
      {
        System.out.println("Two numbers are equal.");
      }
      else
      {
        if(t>u)
        {
          System.out.println("First no is greater than the second.");
        }
        else
        {
          System.out.println("Second no is greater than the first.");
        }
      }
    }
  }
  class Greeting
  {
    void show()
    {
      Scanner bc = new Scanner(System.in);
      System.out.println("Press a button.");
      int button = bc.nextInt();
      if(button == 1)
      {
        System.out.println("Hello");
        
      }
      else if(button == 2)
      {
        System.out.println("Namaste");
      }
      else if(button == 3)
      {
        System.out.println("Bonjour");
      }
      else
      {
        System.out.println("Invalid Button;");
      }
    }
  }
  class GSwitch
  {
    void Show1()
    {
      Scanner rr = new Scanner(System.in);
      System.out.println("Press a button again: ");
      int bt = rr.nextInt();
      switch(bt)
      {
        case 1 : System.out.println("Hello");
        break;
        case 2 : System.out.println("Namaste");
        break;
        case 3 : System.out.println("Bonjour");
        break;
        default : System.out.println("Invalid Input!");
      }
    }
  }
  class Calc
  {
    void Compute()
    {
      Scanner cmp = new Scanner(System.in);
      System.out.println("Enter two numbers to calculate Sum or difference or multiplication  or divission or modulo(Remainder): ");
      int y = cmp.nextInt();
      int h = cmp.nextInt();
      System.out.println("Press 1 to add the numbers\nPress 2 to calculate the difference of two numbers\nPress 3 to do multiplication\nPress 4 to calculate division(always greater/lesser)\nPress 5 to determine modulo(always greater/lesser):");
      int u = cmp.nextInt();
      switch(u)
      {
        case 1 : System.out.println("result is:\n"+(y+h));
        break;
        case 2 :
        {
          if(y>h)
          {
            System.out.println("result is:\n"+(y-h));
          }
          else
          {
            System.out.println("result is:\n"+(h-y));
          }
        }
        break;
        case 3 : System.out.println("result is:\n"+(y*h));
        break;
        case 4 : System.out.println("result is:\n"+(y/h));
        break;
        case 5 : 
        {
          if(y>h)
          {
            System.out.println("result is:\n"+(y%h));
          }
          else
          {
            System.out.println("result is:\n"+(h%y));
          }
        }
        break;
        default : System.out.println("Invalid Input!");
      }
    }
  }
  class MonthofYear
  {
    void Disp()
    {
      Scanner jj = new Scanner(System.in);
      System.out.println("Enter a no from 1 to 12 to display equivalent month: ");
      int yr = jj.nextInt();
      switch(yr)
      {
        case 1 : System.out.println("January");
        break;
        case 2 : System.out.println("February");
        break;
        case 3 : System.out.println("March");
        break;
        case 4 : System.out.println("April");
        break;
        case 5 : System.out.println("May");
        break;
        case 6 : System.out.println("June");
        break;
        case 7 : System.out.println("July");
        break;
        case 8 : System.out.println("August");
        break;
        case 9 : System.out.println("September");
        break;
        case 10 : System.out.println("October");
        break;
        case 11 : System.out.println("November");
        break;
        case 12 : System.out.println("December");
        break;
        default: System.out.println("Invalid input! ");
      }
    }
  }
  class Conditions
  {
    public static void main(String tt[])
    {
      Oddeven ob = new Oddeven();
      Great obj = new Great();
      Greeting obj1 = new Greeting();
      GSwitch ob1 = new GSwitch();
      Calc vk = new Calc();
      MonthofYear hgjk = new MonthofYear();
      ob.check();
      obj.check1();
      obj1.show();
      ob1.Show1();
      vk.Compute();
      hgjk.Disp();
      Scanner gh = new Scanner(System.in);
      System.out.println("Enter a particular age to check adult or not: ");
      int age = gh.nextInt();
      
      if(age<18)
      {
        System.out.println("Not Adult");
        
      }
      else
      {
        System.out.println("Adult");
      }
    
    }
  
  }
