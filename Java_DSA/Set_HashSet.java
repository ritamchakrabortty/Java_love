import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(666);
        nums.add(523);
        nums.add(845);
        nums.add(212);
        nums.add(601);
        // System.out.println(nums.indexOf(5));
        // System.out.println(nums.get(2));
        for(int n: nums)
        {
        System.out.println(n);
        }
        Collection<Integer> numsA= new TreeSet<Integer>();
        numsA.add(666);
        numsA.add(523);
        numsA.add(845);
        numsA.add(212);
        numsA.add(601);
        
        System.out.println("...........................................");
        Iterator<Integer> values= numsA.iterator();
        while(values.hasNext())
        {
            System.out.println(values.next());
        }
    }
}