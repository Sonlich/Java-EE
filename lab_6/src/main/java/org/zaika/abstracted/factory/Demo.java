package org.zaika.abstracted.factory;

import org.zaika.abstracted.factory.classes.ClassFactory;
import org.zaika.abstracted.factory.character.Character;

public class Demo {
    public static void main(String[] args) {
        Character character1 = new Character("Anduin Wrynn", ClassFactory.getClass("Cleric"));
        character1.talk();

        character1.addRaceBonus();
        character1.talk();

        Character character2 = new Character("Varian Wrynn", ClassFactory.getClass("Barbarian"));
        character2.talk();

        character2.addRaceBonus();
        character2.talk();
    }
}
