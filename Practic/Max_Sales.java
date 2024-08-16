import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int arr [][] = new int[d][n];
        for (int i = 0; i < d; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < d; i++)
        {
            int max = 0;
            for (int j = 0;j < n; j++)
            {
                
                if(arr[i][j]>max)
                {
                    max = arr[i][j];
                }
               
            }
            System.out.print(max+" ");
        }
        
        
    }
}