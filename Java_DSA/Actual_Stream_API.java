import java.util.*;
import java.util.stream.Stream;
import java.util.function.Predicate;
class Demo
{
    public static void main(String[] args)
    {
        List<Integer> nums= Arrays.asList(4,5,6,3,2,1,8);
        Predicate<Integer> p = n -> n%2 == 0;
        
        Stream<Integer> s1= nums.stream();
         Stream<Integer> s3= nums.stream();
        Stream<Integer> s2= s1.filter(n -> n%2 == 0);
        Stream<Integer> s4= s2.map(n ->n*2);
        int result = s4.reduce(0, (c,e)->c+e);
        s3.forEach(i -> System.out.println(i));
        int res = nums.stream().filter(p).map(n->n*2).reduce(0, (c,e)->c+e);
        Stream<Integer> sortedValues = nums.stream().filter(n->n%2==0).sorted();
        System.out.println("____________________________");
        System.out.println(result);
        System.out.println("____________________________");
        System.out.println(res);
        System.out.println("____________________________");
        sortedValues.forEach(n->System.out.println(n));

    }

}