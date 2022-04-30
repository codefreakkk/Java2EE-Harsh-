// Abstraction
//abstract class One {
//    public abstract void run();
//    public void pause() {
//        System.out.print("Pause");
//    }
//}
//
//abstract class Two extends One {
//    public abstract void run();
//}
//
//class Base extends Two {
//    public void run() {
//        System.out.println("running");
//    }
//}
//
//public class Abstraction {
//    public static void main(String[] args) {
//        Base obj = new Base();
//        obj.run();
//        obj.pause();
//    }
//}

abstract class One {
    public abstract void run();
}

public class Abstraction {
    public static void main(String[] args) {
        new One() {
          public void run() {
            System.out.println("Called from Anonymous class");
          }
        }.run();
    }
}
