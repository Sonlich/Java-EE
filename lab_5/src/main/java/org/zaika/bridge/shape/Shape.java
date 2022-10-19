package org.zaika.bridge.shape;

import org.zaika.bridge.drawing.DrawingAPI;

public abstract class Shape implements Cloneable{
    protected DrawingAPI drawingAPI;

    public Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try{
            clone = super.clone();
        } catch(CloneNotSupportedException exp){
            exp.printStackTrace();
        }
        return clone;
    }

    public abstract void draw();
}
