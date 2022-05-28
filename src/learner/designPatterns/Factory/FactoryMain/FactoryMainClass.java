package learner.designPatterns.Factory.FactoryMain;

import learner.designPatterns.Factory.factory.ShapeFactory;
import learner.designPatterns.Factory.shape.*;

public class FactoryMainClass {
    public static void main(String[] args) {
        ShapeFactory obj = new ShapeFactory();
//        get instance from ShapeFactory class and then access draw method from the object which you got with ShapeFactory class
        Shape shape = obj.getShape("rect");
        shape.draw();
    }
}
