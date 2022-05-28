package learn.java8;

import java.sql.SQLOutput;
class MyClass <T1, T2> {
    private T1 t1;
    private T2 t2;

    public MyClass(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class GenericsMain {
    public static void main(String[] args) {
        MyClass<Integer, String> obj = new MyClass<>(10, "This is a fucking String");
        int a = obj.getT1();
        String b = obj.getT2();
        System.out.println(a);
        System.out.println(b);
    }
}
