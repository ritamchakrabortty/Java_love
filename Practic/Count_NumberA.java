import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        String s,s2;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        s2=sc.next();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== s2.charAt(0))
            count++;
        }
        System.out.println(count);

    }
}