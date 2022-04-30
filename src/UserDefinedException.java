import java.lang.*;

class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

class Test {
    public void checkAge(int age) throws MyException {
        if(age >= 18) {
            System.out.println("Eligible");
        } else {
            throw new MyException("Not Eligible");
        }
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        Test obj = new Test();
        try {
            obj.checkAge(9);
        } catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
