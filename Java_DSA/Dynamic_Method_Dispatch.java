class A
{
    int a=5;
    int b=5;
    public void show()
    {
        System.out.println("in A Show");
    }
    public void show1()
    {
        System.out.println(a+b);
    }
}
class B extends A
{
        int c =10;
        public void show()
        {
            System.out.println("in B Show");
        }
          public void show1()
    {
        System.out.println(a+b+c);
    }
}
class C extends A
{
        public void show()
        {
            System.out.println("in C Show");
        }
}
class Demo
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
        obj.show1();

        obj = new B();
        obj.show();
        obj.show1();
        obj = new C();
        obj.show();
        obj.show1();

        A obj1 = new B();
        System.out.println(obj1);
    }
}