package learn.java8;

import java.util.ArrayList;
import java.util.List;

// whenever we have a functional interface we can use lamda expression

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
