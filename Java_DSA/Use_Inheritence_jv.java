interface Computer
{
    void code();
}
class  Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code , Compile, Run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code , Compile, Run: Faster");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}
class Demo
{
    public static void main(String[] args)

    {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Developer abc = new Developer();
        abc.devApp(desktop);
    }
}