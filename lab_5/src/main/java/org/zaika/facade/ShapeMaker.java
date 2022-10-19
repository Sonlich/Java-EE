package org.zaika.facade;

import org.zaika.facade.shape.Circle;
import org.zaika.facade.shape.Rectangle;
import org.zaika.facade.shape.Shape;
import org.zaika.facade.shape.Square;

public class ShapeMaker {
    public void drawCircle() {
        Shape circle = new Circle();
        circle.draw();
    }

    public void drawSquare() {
        Shape square = new Square();
        square.draw();
    }

    public void drawRectangle() {
        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
