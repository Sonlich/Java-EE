package org.zaika.visitor.visitor;

import org.zaika.visitor.character.Character;
import org.zaika.visitor.classes.CharacterClass;
import org.zaika.visitor.race.CharacterRace;
import org.zaika.visitor.stats.Stats;

public class ElementConsoleVisitor implements DataElementVisitor {
    @Override
    public void visit(Character character) {
        System.out.println("Name: " + character.getName());
    }

    @Override
    public void visit(CharacterClass characterClass) {
        System.out.println("Class: " + characterClass.getClassName());
        System.out.println("HP: " + characterClass.getHp());
    }

    @Override
    public void visit(Stats stats) {
        System.out.println("-------Attributes-------");
        stats.getStats().forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
        System.out.println("------------------------");
    }

    @Override
    public void visit(CharacterRace characterRace) {
        System.out.println("Race: " + characterRace.getRaceName());
        System.out.println("---------Bonuses---------");
        characterRace.getRaceBonuses().getStats().forEach((key, value) -> System.out.printf("bonus_%s: %d\n", key, value));
        System.out.println("-------------------------");
    }


}