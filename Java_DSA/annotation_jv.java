class A{
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A show");
    }
}
class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}
class Demo
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
