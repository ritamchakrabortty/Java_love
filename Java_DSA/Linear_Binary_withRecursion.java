class DemoR
{
    public static void main(String[] args)
    {
        int nums[] = {1,3,5,7,9,11,13,15,17};

        int target = 9;

        int result = linearSearch(nums, target);
        if (result !=-1)
            System.out.println("Element fount at Index by linear Search "+result);
        else
             System.out.println("Element not fount  ");
        result = binarySearch(nums, target);
        if (result !=-1)
            System.out.println("Element fount at Index by binary search "+result);
        else
             System.out.println("Element not fount  ");
        result = binarySearch_REC(nums, target,0,nums.length-1);
        if (result !=-1)
            System.out.println("Element fount at Index by binary search recurssion: "+result);
        else
             System.out.println("Element not fount  ");    

    }
    public static int linearSearch(int[] nums, int target)
    {
        int steps = 0;
        for (int i = 0; i < nums.length; i++)
        {
            steps++;
            if (nums[i] == target)
            {
                System.out.println("Steps taken by linear: "+steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear: "+steps);
        return -1;
    }
 
    public static int binarySearch(int[] nums, int target)
 
    {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        int steps = 0;
        while (left <= right)
        {
            steps++;
            mid = (left+right) / 2;
            if(nums[mid] == target)
            {
                System.out.println("Steps taken by binary: "+steps);
                return mid;
            }
            else if (nums[mid]<target)
            {
                left = mid + 1;
            }
            else if (nums[mid]>target)
            {
                right = mid -1;
            }
        }
        System.out.println("Steps taken by binary: "+steps);
        return -1;
    }
    public static int binarySearch_REC(int[] nums, int target,int left,int right)
    {
        if(left<=right)
        {
            int mid =(left+right)/2;
            if(nums[mid]==target)
            {
                //System.out.println("Steps taken by binary recursion: "+steps);
                return mid;
            }
            else if(nums[mid]<target)
            {
                left = mid+1;
            }
            else if (nums[mid]>target)
            {
                right = mid -1;
            }
            binarySearch_REC(nums,target,left,right);
        }
        
            return -1;
        
    }
}