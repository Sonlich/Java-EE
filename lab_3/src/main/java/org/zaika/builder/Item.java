package org.zaika.builder;
import org.zaika.builder.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
