package CollectionFramework.ComparatorEx;

import java.util.*;

class SortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
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
        Collections.sort(list, new SortByRollNo());

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
