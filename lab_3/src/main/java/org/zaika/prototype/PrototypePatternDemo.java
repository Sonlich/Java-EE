package org.zaika.prototype;
import org.zaika.prototype.shape.Shape;

public class PrototypePatternDemo {
    public static void main(String[] args){
        ShapeCache shapeCache = new ShapeCache();
        shapeCache.loadCache();

        Shape figure1 = shapeCache.getShape("1");
        System.out.println("Id: " + figure1.getId() + '\n' +
                "Shape: " + figure1.getType() +'\n' +
                "------------------------------" + '\n');


        Shape figure2 = shapeCache.getShape("2");
        System.out.println("Id: " + figure2.getId() + '\n' +
                "Shape: " + figure2.getType() +'\n' +
                "------------------------------" + '\n');

        Shape figure3 = shapeCache.getShape("3");
        System.out.println("Id: " + figure3.getId() + '\n' +
                "Shape: " + figure3.getType() +'\n' +
                "------------------------------" + '\n');
    }
}
