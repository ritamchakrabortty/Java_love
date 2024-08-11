import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        int x,o=0,e=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd [] = new int[n];
        int even [] = new int[n];
        for (int i = 0; i < n; i++)
        {
            x = sc.nextInt();
            if(x%2 == 0)
            {
               even[e]=x;
                e++;
            }
            else
            {
                
                odd[o]=x;
                o++;
            }
            
        }

        for(int i = 0; i <even.length; i++)
        {
            if(even[i]!='\0')
            System.out.print(even[i]+" ");
        }
        for(int i = 0; i < odd.length; i++)
        {
            if(odd[i]!='\0')
            System.out.print(odd[i]+" " );
        }
    }
}