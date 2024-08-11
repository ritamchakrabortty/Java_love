import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int arr []=new int[n];
        if(n<106 && n>0)
        {
            for (int i = 0; i < n; i++)
            {
                    
                    int x = sc.nextInt();
                    if(x<106 && x>0)
                    {
                        double y = Math.sqrt(x);
                        if(y == (int) y)
                        {
                            count++;
                        }
                    }
                    else
                    {
                        System.exit(0);
                    }
                
            }
            System.out.println(count);
        }
        
        
    }
}