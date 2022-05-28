package Innerclasses;


// Nested Inner class

class Outer {
    public void outerMethod() {
        System.out.println("Outer method called");
    }
    class Inner {
        public void innerMethod() {
            System.out.println("Inner method called");
        }
        public static void staticMethod() {
            System.out.println("Static method called");
        }
    }
}

public class NestedInnerClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.innerMethod();
        Outer obj1 = new Outer();
        obj1.outerMethod();
        Outer.Inner.staticMethod();
    }
}


// Method local Inner class

//
//class Outer {
//    void outerMethod() {
//        class Inner {
//            private int a = 10;
//            public int getInt() {
//                return a;
//            }
//        }
////      Create object of Inner class in method only. We cannot create object of Inner class outside the method
//        Inner obj = new Inner();
//        System.out.println(obj.getInt());
//    }
//}
//
//public class NestedInnerClass {
//    public static void main(String[] args) {
//        Outer obj = new Outer();
//        obj.outerMethod();
//    }
//}


// Static Nested Class

//class Outer {
//    public static void outerMethod() {
//        System.out.println("Outer Method called");
//    }
//    static class Inner {
//        public void innerMethod() {
//            outerMethod();
//        }
//    }
//}
//
//public class NestedInnerClass {
//    public static void main(String[] args) {
////        calling static class innerMethod()
//        new Outer.Inner().innerMethod();
//    }
//}


// Anonymous class

//class Demo {
//    public void getData() {
//        System.out.println("Get Data method called from Demo class");
//    }
//}
//
//public class NestedInnerClass {
//    static Demo obj = new Demo() {
//        public void getData() {
//            super.getData();
//        }
//    };
//    public static void main(String[] args) {
//        obj.getData();
//    }
//}
