//hirarchical inheritance

//class First {
//    public void getData1() {
//        System.out.println("First class function called");
//    }
//}
//class Second extends First {
//    public void getData2() {
//        System.out.println("Second class function called");
//    }
//}
//class Third extends First {
//    public void getData3() {
//        System.out.println("Third class function called");
//    }
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//        Third obj = new Third();
//        obj.getData2();
//    }
//}

// Multiple Inheritance

//interface First  {
//    public abstract void send1();
//}
//interface Second {
//    public abstract void send2();
//}
//class Okay implements First, Second {
//   static {
//       System.out.println("Static Block called");
//   }
//    @Override
//    public void send1() {
//        System.out.println("Send1 Method");
//    }
//    @Override
//    public void send2() {
//        System.out.println("Send2 Method");
//    }
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//        Okay obj = new Okay();
//        obj.send1();
//        obj.send2();
//    }
//}

//Hybrid Inheritance

interface First  {
    public abstract void send1();
}
interface Second extends First {
    public abstract void send2();
}
interface Third extends First {
    public abstract void send3();
}
class Fourth implements Second, Third {
    @Override
    public void send1() {
        System.out.println("Send1");
    }
    @Override
    public void send2() {
        System.out.println("Send2");
    }
    @Override
    public void send3() {
        System.out.println("Send3");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Fourth obj = new Fourth();
        obj.send2();
    }
}