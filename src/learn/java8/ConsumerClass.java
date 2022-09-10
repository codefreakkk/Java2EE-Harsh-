package learn.java8;

import java.util.function.Consumer;
import java.util.*;

class ConsumerMain implements Consumer<Integer> {
    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}

public class ConsumerClass {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 1st way
//        list.forEach(new ConsumerMain());

        // 2nd way
//        list.forEach(new Consumer<Integer>() {
//           @Override
//           public void accept(Integer i) {
//               System.out.println(i);
//           }
//        });

//        3rd way
//        list.forEach((Integer i) -> {
//            System.out.println(i);
//        });

//        4th way
        list.forEach(i -> System.out.println(i + 200));
    }
}
