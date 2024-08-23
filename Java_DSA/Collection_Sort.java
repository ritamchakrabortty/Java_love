import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Comparator<Integer> com = new Comparator<Integer>() 
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(29);
        nums.add(72);
        nums.add(43);
        nums.add(55);
        nums.add(31);

        Collections.sort(nums,com);
        System.out.println(nums);
    }
}