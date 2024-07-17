class Human
{
    private int age = 0;
    private String name = "";

    public int getAge()//getter method
    {
        return age;
    }
    public void setAge(int age/*,Human obj*/)//setter method
    {   
        // Human obj1 = obj;
        // obj.age=age;
        this.age=age;
    }
    public String getName()//getter method
    {
        return name;
    }
    public void setName(String name)//setter method
    {
        this.name=name;
    }
}

class Demo
{
    public static void main(String[] args)
    {
        Human obj = new Human();
         System.out.println(obj.getName()+" : "+obj.getAge());
        obj.setAge(111/*,obj*/);
        obj.setName("John");
        //System.out.println(obj.getName()+" : "+obj.getAge());
    }
}