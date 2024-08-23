import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        for(int n: nums)
        {
        System.out.println(n);
        }
    }
}