import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        String s;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int n = s.length();
        for (int i = 0; i < n; i++)
        {
            if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}