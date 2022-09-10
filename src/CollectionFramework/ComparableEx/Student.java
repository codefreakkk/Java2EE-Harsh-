package CollectionFramework.ComparableEx;

public class Student implements Comparable<Student> {
    public int rollNo;
    public String name = "";

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return this.rollNo + " " + this.name;
    }

    @Override
    public int compareTo(Student s) {
        return this.rollNo < s.rollNo ? 1 : -1;
    }
}
