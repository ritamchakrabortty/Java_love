class A{
    public A() 
    {
        System.out.println("Object created");
    }
    public void show() 
    {
        System.out.println("in A show");
    }

}
class Demo
{
    public static void main(String[] args)
    {
        new A();
        new A().show();
    }
}