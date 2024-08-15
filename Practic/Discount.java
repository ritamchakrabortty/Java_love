import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        int c=0,x,d,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            x = sc.nextInt();
            if(x>0 && d%x==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}