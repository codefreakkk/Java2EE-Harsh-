package learn.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PredicateEven implements Predicate<Integer> {
        @Override
        public boolean test(Integer integer) {
            return integer % 2 == 0;
        }
}

public class StreamApiMain {
    public static void main(String[] args) {
//        get even elements
        List<Integer> list = List.of(1, 2, 3, 4, 5);
//        list = list.stream().filter(i -> i % 2 == 0 ).collect(Collectors.toList());
//        System.out.println(list);

        // get elements >= 3
//        list = list.stream().filter(i -> i >= 3).collect(Collectors.toList());
//        System.out.println(list);

        // create stream API's object
//        Stream<Integer> stream = list.stream();

        // sort list sorted() method
//        List<Integer> list =  List.of(1, 2, 3, 4, 5);
//        list = list.stream().sorted((a, b) -> a < b ? 1 : -1).collect(Collectors.toList());
//        System.out.println(list);

        // convert list to array
//        int[] nums = list.stream().mapToInt(i->i).toArray();
//        System.out.println(Arrays.toString(nums));

        // get sum of whole array
//        int sum = list.stream().mapToInt(i -> i).sum();
//        System.out.println(sum);





        // reduce() method
//        reduce operation applies a binary operator to each element in the stream where the first
//        argument to the operator is the return value of the previous application and second argument
//        is the current stream element.

        // reduce(starting value, binary operator)
//        Integer num = list.stream().reduce(0, (a, b) -> a + b);
//        System.out.println(num);

        // max value using reduce
//        System.out.println(list.stream().reduce(0, (a, b) -> a > b ? a : b));




        // map method
//        System.out.println(list.stream().map(i -> i * 110).collect(Collectors.toList()));
    }
}
