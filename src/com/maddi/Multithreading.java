package com.maddi;

//Creating thread using class

//class Thread1 extends Thread {
//    @Override
//    public void run() {
//        System.out.println("I am Thread 1");
//    }
//}
//public class Multithreading  {
//    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//        t1.start();
//    }
//}

//creating thread using Runnable Interface

//class Thread1 implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("I am Runnable");
//    }
//
//}
//
//public class Multithreading {
//    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//
//        Thread obj = new Thread(t1);
//        obj.start();
//    }
//}

//class Thread1 extends Thread {
//    public void run() {
//        try {
//            Thread.sleep(0000);
//            System.out.println("Thread 1 is running");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//class Thread2 extends Thread {
//    public void run() {
//        System.out.println("Thread 2 is running");
//    }
//}
//
//class Thread3 extends Thread {
//    public void run() {
//        System.out.println("Thread 3 is running");
//    }
//}
//
//public class Multithreading {
//    public static void main(String[] args) {
//        try {
//            Thread1 t1 = new Thread1();
//            Thread2 t2 = new Thread2();
//            Thread3 t3 = new Thread3();
//            t1.start();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

//Synchronized keyword

//class Demo {
//    public int count = 0;
//    synchronized public void add() {
//        count += 1;
//    }
//    public void getCount() {
//        System.out.println(count);
//    }
//}
//
//public class Multithreading {
//    public static void main(String[] args) {
//        Demo obj = new Demo();
//        Thread t1 = new Thread() {
//            public void run() {
//                int i;
//                for(i = 1; i <= 1000; i++) {
//                    obj.add();
//                }
//            }
//        };
//        Thread t2 = new Thread() {
//            public void run() {
//                int i;
//                for(i = 1; i <= 1000; i++) {
//                    obj.add();
//                }
//            }
//        };
//        try {
//            t1.start();
//            t2.start();
//
//            t1.join();
//            t2.join();
//            obj.getCount();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//}


// Interthread communication

class Bank {
    public int balance = 50;

    synchronized public void withdraw(int amount) {
        try {
            if(amount > balance) {
                wait();
                System.out.println("Code after wait method is called");
//                deduct amount from account
                balance = balance - amount;
            } else {
                balance = balance - amount;
            }
            System.out.println("Withraw successfull");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    synchronized public void deposit(int dep) {
        try {
            balance = balance + dep;
            notifyAll();
            System.out.println("Deposit successfull");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank();
            Thread t1 = new Thread() {
                public void run() {
                    bank.withdraw(100);
                }
            };
            Thread t2 = new Thread() {
                public void run() {
                    bank.deposit(0);
                }
            };
            t1.start();
            t2.start();


        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
