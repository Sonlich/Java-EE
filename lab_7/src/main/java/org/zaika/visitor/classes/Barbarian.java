package org.zaika.visitor.classes;

import org.zaika.visitor.visitor.DataElementVisitor;

public class Barbarian extends CharacterClass{
    private final String perk;

    public Barbarian() {
        this.name = "Barbarian";
        this.hp = 12;
        perk = "Battle Rage";
    }

    @Override
    public void printMagika() {
        System.out.println(
                "Class: " + name + "\n" +
                "Ability: " + perk);
    }

    @Override
    public void acceptOperation(DataElementVisitor visitor) {
        visitor.visit(this);
    }
}
