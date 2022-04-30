class Demo {
    public Demo() {
        System.out.println("Demo default Constructor");
    }
    public Demo(int a) {
        System.out.println("Demo Constructor called " + a);
    }
    public void send() {
        System.out.println("Sent from Demo class");
    }
}
class Demo2 extends Demo {
    public Demo2() {
        super();
        System.out.println("Demo2 default constructor");
    }
    public Demo2(int a) {
        super(a);
        System.out.println("Demo2 Constructor called");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Demo2 obj = new Demo2(90);
    }
}
