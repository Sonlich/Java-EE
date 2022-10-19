package org.zaika.bridge.shape;

import org.zaika.bridge.drawing.DrawingAPI;

public class Circle extends Shape {
    private final int radius;
    private final double x;
    private final double y;

    public Circle(int radius, double x, double y, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {
        drawingAPI.drawCircle(radius, x, y);
    }
}