package org.zaika.bridge.drawing;

public class RedPen implements DrawingAPI{
    @Override
    public void drawCircle(int radius, double x, double y) {
        System.out.printf("""
                Drawing the circle with:\s
                 radius: %s\s
                 x: %s\s
                 y: %s\s
                 colour: red\s
                 ----------------------------------
                """, radius, x, y);
    }
}
