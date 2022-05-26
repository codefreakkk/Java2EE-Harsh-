package com.maddi;

import java.lang.Exception.*;

class A {
    public void get() throws Exception {
        System.out.println(1/0);
    }
    public void ans() {
        try {
            this.get();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

public class Excep {
    public static void main(String[] args) {
//        try {
//            int a = 1 / 1;
//            System.out.println(a);
//            return;
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//        finally {
//            System.out.println("shdgflkasjdkljf");
//        }
        A obj = new A();

    }
}
