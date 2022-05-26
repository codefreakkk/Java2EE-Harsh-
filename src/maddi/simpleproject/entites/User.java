package maddi.simpleproject.entites;

public class User {
    private String name;
    private int age;
    private int rollNo;

    public User(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }


//    setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
//    getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getRollNo() {
        return rollNo;
    }
}
