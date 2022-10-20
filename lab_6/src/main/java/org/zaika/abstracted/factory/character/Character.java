package org.zaika.abstracted.factory.character;

import org.zaika.abstracted.factory.classes.CharacterClass;
import org.zaika.abstracted.factory.stats.Stats;

public class Character {
    private final String name;
    private final CharacterClass characterClass;
    private final Stats attributes;

    public Character(String name, CharacterClass characterClass) {
        this.name = name;
        this.characterClass = characterClass;
        attributes = Stats.generate();
    }

    public void addRaceBonus() {
        Integer health = characterClass.getHp() + (int) Math.floor(attributes.getStats().get("constitution") / 2D) - 5;

        attributes.getStats().put("health", health);
    }

    public void talk(){
        System.out.printf("""
                --------------------------
                Name: %s
                """, name);
        characterClass.printMagika();
        System.out.print("""
                
                -----------------------------------------------
                ATTRIBUTES
                """);
        for (String attribute : attributes.getStats().keySet()) {
            System.out.println(attribute + ": " + attributes.getStats().get(attribute));
        }
    }
}
