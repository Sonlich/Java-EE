package org.zaika.factory.method;

import org.zaika.factory.method.factory.DwarfFactory;
import org.zaika.factory.method.factory.ElfFactory;
import org.zaika.factory.method.factory.RaceAbstractFactory;
import org.zaika.factory.method.character.Character;

public class Demo {
    public static void main(String[] args) {
        RaceAbstractFactory raceAbstractFactory = new DwarfFactory();
        Character character = new Character("Muradin BronzeBeard", raceAbstractFactory.create());
        System.out.println("\nThe attributes before race bonus");
        character.talk();
        character.addRaceBonuses();
        System.out.println("\nThe attributes after race bonus");
        character.talk();

        raceAbstractFactory = new ElfFactory();
        character = new Character("Tyrande Whisperwind", raceAbstractFactory.create());
        System.out.println("\nThe attributes before race bonus");
        character.talk();
        character.addRaceBonuses();
        System.out.println("\nThe attributes after race bonus");
        character.talk();
    }
}
