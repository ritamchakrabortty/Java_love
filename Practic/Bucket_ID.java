import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        long max =0;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while(n>0)
        {
            long d = n%10;
            if(d>max)
            {
                max = d;
            }
            n = n/10;
            
        }
        System.out.println(max);
       
    }
}