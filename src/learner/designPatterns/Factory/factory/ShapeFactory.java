package learner.designPatterns.Factory.factory;

import learner.designPatterns.Factory.shape.*;

public class ShapeFactory {
    public Shape getShape(String str) {
        if(str.equals("rect") || str.equals("Rect"))
            return new Rectangle();
        else
            return new Circle();

    }
}
