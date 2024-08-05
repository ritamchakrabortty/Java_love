@FunctionalInterface
interface A{
    void show(int i);
}
@FunctionalInterface
interface B{
    int add(int i,int j);
}
class Demo
{
    public static void main(String[] args)
    {
        A obj = i -> System.out.println("in show LAMBDA function "+i);
          
        ;
        obj.show(10);
        A obj1 = new A()
        {
            public void show(int i)
            {
                System.out.println("in cshow "+i);
            }
        };
         obj1.show(0);
        B obj2 = (i,j) -> i+j;

        int result = obj2.add(5,9);
        System.out.println("Result is: "+result);
    }
}