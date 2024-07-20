class Calc
{
     public int add(int n1, int n2)
     {
        return n1 + n2;
     }
     public int sub(int n1, int n2)
     {
        return n1-n2;
     }
}
class AdvCalc extends Calc
{
    public int multi(int n1, int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}

class Demo
{
    public static void main(String[] args)
    {
           AdvCalc c = new AdvCalc();
            int a=c.add(6,7);
            int b=c.sub(7,6);
            int k=c.multi(6,7);
            int d=c.div(42,6);
            System.out.println(a+" and "+b+" multi: "+k+" division: "+d);
    }
}