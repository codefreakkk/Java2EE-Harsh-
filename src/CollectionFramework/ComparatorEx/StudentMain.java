package CollectionFramework.ComparatorEx;

import java.util.*;

class SortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if(a.rollNo > b.rollNo) return 1;
        return -1;
    }
}

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(23, "bash"));
        list.add(new Student(89, "airaj"));
        list.add(new Student(72, "darsh"));
        list.add(new Student(2, "cirat"));

        // sort by roll number
//        Collections.sort(list, new SortByRollNo());
        Collections.sort(list, (s1, s2) -> {
            return s1.rollNo < s2.rollNo ? 1 : -1;
        });
        for(Student s : list) System.out.println(s);
    }
}
