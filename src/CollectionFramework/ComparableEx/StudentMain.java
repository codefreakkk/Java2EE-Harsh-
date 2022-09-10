package CollectionFramework.ComparableEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "harsh"));
        list.add(new Student(1, "raj"));
        list.add(new Student(2, "striver"));

        Collections.sort(list);
        for(Student s : list) System.out.println(s);
    }
}
