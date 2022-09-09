package CollectionFramework;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(-4);
        list.add(2);

//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                if(a < b) return 1;
//                return -1;
//            }
//        });

        Collections.sort(list, new ComparatorClass());

        System.out.println(list);
    }
}
