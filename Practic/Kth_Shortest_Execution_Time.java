import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int arr []= new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++)
        {
            int flag =0;
            for (int j = 0; j <n-i-1;j++)
            {

                if(arr[j] >arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag++;
                }
            }
            if(flag == 0)
            {
                break;
            }
        }
        System.out.println(arr[k-1]);
        
    }
}