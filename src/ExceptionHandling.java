import java.lang.*;
class Harsh {
    public void run1() {
        try {
            System.out.println(10 / 9);
        } catch(Exception e) {
            System.out.println("Cannot Divide by 0");
        }
        finally {
            System.out.println("Finally block");
        }
    }
    public void run2() throws RuntimeException {
        System.out.println(1/0);
    }
    public void run3(int age) {
        if(age >= 18) {
            System.out.println("Person is Eligible");
        } else {
            throw new RuntimeException("Person is not Eligible");
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Harsh obj = new Harsh();
    }
}
