package org.zaika.bridge.drawing;

public class GreenPen implements DrawingAPI{
    @Override
    public void drawCircle(int radius, double x, double y) {
        System.out.printf("""
                Drawing the circle with:\s
                 radius: %s\s
                 x: %s\s
                 y: %s\s
                 colour: green\s
                 ----------------------------------
                """, radius, x, y);
    }
}
