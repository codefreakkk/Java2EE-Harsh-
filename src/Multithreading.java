
//class Threading extends Thread{
//    public void show() {
//        System.out.println("Name of thread is " + Thread.currentThread().getName());
//        System.out.println("ID of thread is " + Thread.currentThread().getId());
//    }
//    public void run() {
//        try {
////            System.out.println("Thread Name is " + Thread.currentThread().getName());
//            for(int i = 0; i < 10; i++) {
//                System.out.print(i + " ");
//                Thread.sleep(1000);
//            }
//        } catch(Exception e) {
//            System.out.println("Some error occured");
//        }
//    }
//}
//
//class Threading2 extends Thread {
//    public void run() {
//        try {
//            for(int i = 10; i > 0; i--) {
//                System.out.print("harsh"+i);
//                Thread.sleep(2000);
//            }
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

//class Counter {
//    public int count = 0;
//
//    public synchronized void increment() {
//        count++;
//    }
//}
//
//public class Multithreading {
//    public static void main(String[] args) throws Exception {
////        Threading obj = new Threading();
////        Threading2 obj2 = new Threading2();
////        obj.start();
////        obj2.start();
////
////        obj.join();
////        obj2.join();
////        System.out.println("heyyyyyyyyyyyyyyyy");
//
//        Counter c = new Counter();
//
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i < 1000; i++) {
//                    c.increment();
//                }
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i < 1000; i++) {
//                    c.increment();
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//
//        System.out.println(c.count);
//    }
//}
// Inter Thread Communication
class Bank {
    private int amount = 100000;
    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw");
        if(this.amount < amount) {
            System.out.println("Less Balance waiting for deposit");
            try {
                wait();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println("Withdraw Completed");
    }
    synchronized void show() {
        try {
            wait();
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Show method called");
    }
    synchronized void deposit(int amount) {
        System.out.println("Going to deposit");
        this.amount += amount;
        System.out.println("Deposite completed");
        notifyAll();
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Bank obj = new Bank();
        Thread t1 = new Thread() {
            public void run() {
                obj.withdraw(200000);
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                obj.deposit(50000);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.show();
            }
        };

        t1.start();
        t2.start();
        t3.start();
    }
}