class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return model + " : " + price;
    }
    public boolean equals(Laptop that)
    {
        
            return this.model.equals(that.model) && that.price == that.price;
        
    }
}

class Demo
{
    public static void main(String[] args)
    {
        Laptop obj = new Laptop();
        obj.model = "HP";
        obj.price = 60000;

        Laptop obj1 = new Laptop();
        obj1.model = "HP"; 
        obj1.price = 60000;

        boolean result = obj.equals(obj1);
        System.out.println(obj);
        System.out.println(obj.toString());
          System.out.println(result);
    }
}