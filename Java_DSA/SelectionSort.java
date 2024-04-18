class Demo
{
    public static void main(String[] args)
    {
        int nums[] = {5,2,1,3,9,7,6};
        int size = nums.length;
        int minIndex = -1;
        System.out.println("Before sortings");
        for(int num: nums)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < size-1; i++)
        {
            minIndex=i;
            for(int j=i+1; j < size; j++)
            {
                if(nums[minIndex]>nums[j])
                {
                    minIndex=j;
                }
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i]=temp;

            }

        }
        System.out.println("After sortings");
        for(int num: nums)
        {
            System.out.print(num + " ");
        }
    }
}