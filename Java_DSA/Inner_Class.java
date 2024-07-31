class Outer{
    int age;
     public void show()
     {
        System.out.println("in outer show:..........");
     }

    class Inner
    {
        public void config()
        {
            System.out.println("in inner config:..........");
        }
    }

    static class Static_Inner
    {
        public void config1()
        {
            System.out.println("in static inner config:..........");
        }
    }

}

class Demo
{
    public static void main(String[] args)
    {
        Outer obj = new Outer();
        Outer.Inner obj1 =   obj.new Inner();

        Outer.Static_Inner obj2 = new Outer.Static_Inner();

        obj.show();
        obj1.config();
        obj2.config1();
    }
}