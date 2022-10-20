package org.zaika.factory.method.character;

import org.zaika.factory.method.race.CharacterRace;
import org.zaika.factory.method.stats.Stats;


public class Character {
    private final String name;
    private final Stats attributes;
    private final CharacterRace race;

    public Character(String name, CharacterRace race) {
        this.name = name;
        this.race = race;
        attributes = Stats.generate();

    }


    public void addRaceBonuses() {
        for (String attribute : attributes.getStats().keySet()) {
            attributes.getStats().put(attribute, attributes.getStats().get(attribute) + race.getRaceBonuses().getStats().get(attribute));
        }
    }

    public void talk(){
        System.out.printf("""
                -----------------------------------------------
                Name: %s
                Race: %s
                """, name, race.getRaceName());
        race.saySMTH();
        System.out.print("""
                
                -----------------------------------------------
                ATTRIBUTES
                """);
        for (String attribute : attributes.getStats().keySet()) {
            System.out.println(attribute + ": " + attributes.getStats().get(attribute));
        }
    }
}
