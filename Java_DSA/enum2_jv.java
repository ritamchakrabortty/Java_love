enum Laptop
{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private Laptop()
    {
        price = 500;
        System.out.println("in Laptop " + this.name());
    }

    private Laptop(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}

class Demo
{
    public static void main(String[] args)
    {
            
            Laptop lap = Laptop.Macbook;
            System.out.println(lap+" : "+lap.getPrice());
            for(Laptop l : Laptop.values())
            {
                System.out.println(l+" : "+l.getPrice());
            }

    }
}