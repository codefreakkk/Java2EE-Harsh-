package CollectionFramework.ComparatorEx;

public class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString() {
        return this.rollNo + " " + this.name;
    }
}
