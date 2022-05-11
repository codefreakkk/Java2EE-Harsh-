
public class GarbageCollection {
    protected void finalize() {
        System.out.println("Garbage collected and finalize method called");
    }
    public static void main(String[] args) {
        GarbageCollection obj = new GarbageCollection();
        obj = null;
        System.gc();
    }
}
