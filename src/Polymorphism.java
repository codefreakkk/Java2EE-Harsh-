//importing classes from user designed packages

//import utilitis.Intrest;

//public class Polymorphism extends Intrest {
//    public void showIntrest() {
//        System.out.println(this.getIntrest());
//    }
//    public static void main(String args[]) {
//        Polymorphism obj = new Polymorphism();
//        obj.showIntrest();
//    }
//}

// compile time polymorphism

//public class Polymorphism {
//   public static int getData(int a) {
//       return a;
//   }
//   public static int getData(int a, int b) {
//       return a+ b;
//   }
//   public double getData(double a) {
//       return a;
//   }
//
//   public static void main(String args[]) {
//        Polymorphism ob = new Polymorphism();
//        int ans = Polymorphism.getData(20,1);
//        System.out.println(ans);
//   }
//}

//run time polymorphism

class A {
    public int getData() {
        return 10;
    }
}

class B extends A {
    public int getData() {
        return 20;
    }
}

class C extends A {
    public int getData() {
        return 30;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A ob = new C();
        System.out.println(ob.getData());
    }
}


























