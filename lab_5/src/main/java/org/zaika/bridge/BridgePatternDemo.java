package org.zaika.bridge;

import org.zaika.bridge.drawing.GreenPen;
import org.zaika.bridge.drawing.RedPen;
import org.zaika.bridge.shape.Circle;

public class BridgePatternDemo {
    public static void main(String[] args){
        Circle redCircle = new Circle(6, 0, 0, new RedPen());
        Circle greenCircle = new Circle(3, -2, 4, new GreenPen());

        redCircle.draw();
        greenCircle.draw();
    }
}
