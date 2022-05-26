
class MyClass {
    public void get() {
        System.out.println("Myclass method called");
    }
}

class YourClass extends MyClass {
    public void get() {
        System.out.println("Your Class method called");
    }
}

public class InstanceOfOperator {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj instanceof YourClass);
    }
}
