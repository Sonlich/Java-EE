package org.zaika.prototype;

import org.zaika.prototype.shape.Circle;
import org.zaika.prototype.shape.Rectangle;
import org.zaika.prototype.shape.Shape;
import org.zaika.prototype.shape.Square;

import java.util.HashMap;

public class ShapeCache {
    private static final HashMap<String, Shape> shapeMap = new HashMap<>();

    public Shape getShape(String id) {
        return (Shape) shapeMap.get(id).clone();
    }

    public void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}