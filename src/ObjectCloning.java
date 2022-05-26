public class ObjectCloning implements Cloneable {
    private int a;
    public ObjectCloning(int a) {
        this.a = a;
    }
    public void getData() {
        System.out.println("Your data is " + a);
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            ObjectCloning obj = new ObjectCloning(10);
            ObjectCloning obj1 = (ObjectCloning) obj.clone();
            obj1.getData();
            obj.getData();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
