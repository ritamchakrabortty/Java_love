import java.util.*;
class Demo
{
    public static boolean isPrime(int n)
    {
        int c=0;
        n = Math.abs(n);
        if(n ==1)
            return false;
        if(n ==2)
            return true;
        for (int i = 2; i < n/2; i++)
        {
            if(n%i ==0)
            {
                c++;
            }    
        }
        if(c == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        int minPrime = 0;
        int maxPrime = 0;
        if(a<b && a>-109 && b>-109  && a<109 && b<109)
        {
            for(int i=a;i<=b;i++)
            {
                if(isPrime(i) == true)
                {
                    if(minPrime == 0)
                    {
                        minPrime = i;
                    }
                    maxPrime = i;
                }
            }
            System.out.println(Math.abs(maxPrime+minPrime));
        }
        
    }
}