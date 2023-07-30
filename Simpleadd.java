import java.util.*;
class Calculator
{
    int add(int x, int y)
    {
        return (x + y);
    }
}
class Demo
{
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number space separated :  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculator cal = new Calculator();
        System.out.println(cal.add(a, b));
    }
}