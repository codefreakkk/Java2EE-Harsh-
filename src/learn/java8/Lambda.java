package learn.java8;

@FunctionalInterface
interface A {
    public void getData(int i);
}

public class Lambda {
    public static void main(String[] args) {
        A obj = (i) -> {
            int a = i;
            System.out.println("Number is " + a);
        };
        obj.getData(10);
    }
}
