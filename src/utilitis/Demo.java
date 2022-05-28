package utilitis;

class A {
    public void getData() {
        System.out.println("A class method");
    }
}
public class Demo {
    public void get() {
        System.out.println("Get");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        A obj2 = new A();
    }
}
