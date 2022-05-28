package serialization;

import java.io.*;

class Save implements Serializable {
    private int a;
    public Save(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
}

public class Serialization {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Save obj = new Save(100);
//        Write object to byte stream
            File file = new File("object.txt");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
            System.out.println("Object Saved to file");

//        get data from file
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fin);
            Save obj1 = (Save) ois.readObject();
            System.out.println("Your data is " + obj1.getA());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
