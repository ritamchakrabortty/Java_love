interface A{
    void show();
    void config();
    int age = 8;
    String area = "Chin tapak Dum-Dum";
}
interface X{
    void run();
}
interface Y extends X{
}
class B implements A,Y
{
        public void show()
        {
            System.out.println("In  show");
        }
        public void config()
        {
            System.out.println("In  config");
        }
        public void run()
        {
            System.out.println("Running................................................................");
        }
}


class Demo
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
        obj.config();
        obj.run();
        System.out.println(A.area);
    }
}