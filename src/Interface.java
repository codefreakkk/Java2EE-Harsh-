//interface Inter1 {
//    int i = 10;
//    public abstract void run();
//    public static void fuck() {
//        System.out.println("Static method called");
//    }
//}
//interface Inter2 {
//    public abstract void pause();
//}
//class Final implements Inter1 , Inter2{
//    public void run() {
//        System.out.println("Running");
//    }
//    public void pause() {
//        System.out.println("Paused");
//    }
//}
//
//public class Interface {
//    public static void main(String[] args) {
//        Final obj = new Final();
//        obj.run();
//        obj.pause();
//        Inter1.fuck();
//        System.out.println("Variable I value " + Inter1.i);
//    }
//}
interface Inter1 {
    public abstract void run();
    public static void staticMethod() {
        System.out.println("Static method called");
    }
}
interface Inter2 extends Inter1 {
    public abstract void  pause();
}
class Final implements Inter2 {
    @Override
    public void run() {
        System.out.println("Run method called");
    }
    @Override
    public void pause() {
        System.out.println("Pause method called");
    }
}

public class Interface {
    public static void main(String[] args) {
        Inter1.staticMethod();
        Final obj = new Final();
        obj.run();
        obj.pause();
    }
}