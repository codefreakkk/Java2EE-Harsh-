package learn.java8;

interface In1 {
    public int a = 69;
    default public int getNum() {
        return a;
    }
}

interface In2 {
    public int a = 20;
    default public int getNum() {
        return a;
    }
}

class Child implements In1, In2 {
    int a = 10;
    public int getNum() {
        return In1.super.getNum();
    }

}

public class Interface implements In1 {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.getNum());
     }
}

