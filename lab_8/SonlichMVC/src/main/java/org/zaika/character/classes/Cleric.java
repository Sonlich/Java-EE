package org.zaika.character.classes;

import org.zaika.character.classes.CharacterClass;

import java.util.List;

public class Cleric extends CharacterClass {
    private final List<String> spells;

    public Cleric() {
        this.name = "Cleric";
        this.hp = 8;
        this.spells = List.of("Guidance", "Heal");
    }

    @Override
    public void printMagika() {
        System.out.print(
                "Class: " + name + "\n" +
                "Enchant: \n");

        for (String spell : spells) {
            System.out.print("*" + spell + '\n');
        }
    }
}
