class Human
{
    private int age = 0;
    private String name = "";

    public Human()
    {
         System.out.println("in constructor.....................default constructor");
         age = 20;
         name = "Ritam";
    }

   public Human(int a,String n)
   {
        System.out.println("in constructor..................... paramitarized constructor");
        age = a;
        name = n;
   } 
   public Human(Human a, Human b)
   {
         System.out.println("in constructor..................... copy constructor");
        this.age = b.age;
        this.name = a.name;
   }
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
        Human obj1 = new Human(18,"abc");
        Human obj2 = new Human(obj,obj1);
        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());
        System.out.println(obj2.getName()+" : "+obj2.getAge());
        // obj.setAge(111/*,obj*/);
        // obj.setName("John");
        //System.out.println(obj.getName()+" : "+obj.getAge());
    }
}