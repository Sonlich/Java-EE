package org.zaika.visitor.classes;

import org.zaika.visitor.visitor.DataElement;

public abstract class CharacterClass implements DataElement {
    protected String name;
    protected int hp;
    public int getHp() {
        return hp;
    }

    public String getClassName() {
        return name;
    }
    public abstract void printMagika();


}
