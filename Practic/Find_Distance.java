import java.util.*;
class Demo
{
     public static int findTotalDistance(int n,int arr[])
     {
        int sum = 0;
        for(int i=0; i<n-1; i++)
        {
            int l = Math.abs(arr[i]-arr[i+1]);
            sum =sum+l;
        }
        return sum;
     }
     public static void main(String[] args)
    {
        
        int L=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        L=  findTotalDistance(n,arr);
        System.out.println(L);
    }
}