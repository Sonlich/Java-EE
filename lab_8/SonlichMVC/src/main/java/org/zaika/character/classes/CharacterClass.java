package org.zaika.character.classes;

public abstract class CharacterClass {
    protected String name;
    protected int hp;
    public int getHp() {
        return hp;
    }
    public abstract void printMagika();
    public String getClassName() {
        return name;
    }
}
