import java.util.Arrays;

public class vargs {
    public void get(int ...a) {
        System.out.println(a[0]);;
    }

    public static void main(String[] args) {
        vargs obj = new vargs();
        obj.get(1, 2);
    }
}
