class A{
    public void show()throws ClassNotFoundException
    {
        Class.forName("erghijhtrkhjnrtjhnjj");
    }
}
class Demo
{
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) throws ClassNotFoundException
    {
        A obj = new A();
        try
        {
            obj.show();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}