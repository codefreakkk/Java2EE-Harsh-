interface Int1 {
    public void getData();
}
public class BasicStuff {
    public static void main(String[] args) {
//        StringBuilder st = new StringBuilder("harsh");
//        System.out.println(st);
//
        new Int1() {
          public void getData() {
              System.out.println("Interface function called");
          }
        }.getData();
    }
}
