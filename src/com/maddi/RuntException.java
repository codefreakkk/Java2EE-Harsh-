package com.maddi;

class MyException extends Exception {
    public MyException(String msg, int a ) {
        super(msg);
    }
}

public class RuntException {
    public void getAge(int age) throws MyException {
        if(age >= 18) {
            System.out.println("You can");
        } else {
            throw new MyException("You cannot ", 20);
        }
        System.out.println("Pudcha program");
    }

    public static void main(String[] args) {
        RuntException obj = new RuntException();
        try {
            obj.getAge(17);
        } catch(MyException e) {
            e.printStackTrace();
        }
    }
}
