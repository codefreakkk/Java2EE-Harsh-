interface Int1 {
    public void getData();
}
class Const {
    public int a = 10;
    private int b = 20;
    public Const(int a) {
        this.b = a;
    }
    public Const(Const obj) {
        this.a = obj.b;
        System.out.println(this.a);
    }
}
public class BasicStuff {
    public static void main(String[] args) {
//        StringBuilder st = new StringBuilder("harsh");
//        System.out.println(st);
//
//        new Int1() {
//          public void getData() {
//              System.out.println("Interface function called");
//          }
//        }.getData();
        Const obj = new Const(50);
        Const obj1 = new Const(obj);
    }
}
