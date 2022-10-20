package org.zaika.abstracted.factory.classes;

public abstract class CharacterClass {
    protected String name;
    protected int hp;
    public int getHp() {
        return hp;
    }
    public abstract void printMagika();
}
