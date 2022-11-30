package org.zaika.visitor.character;

import org.zaika.visitor.classes.CharacterClass;
import org.zaika.visitor.race.CharacterRace;
import org.zaika.visitor.stats.Stats;
import org.zaika.visitor.visitor.DataElement;
import org.zaika.visitor.visitor.DataElementVisitor;

public class Character implements DataElement {
    private final String name;
    private final CharacterRace race;
    private final CharacterClass clas;
    private final Stats attributes;

    public Character(String name, CharacterRace race, CharacterClass clas) {
        this.name = name;
        this.race = race;
        this.clas = clas;
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

    public String getName() {
        return name;
    }

    public CharacterRace getCharacterRace() {
        return race;
    }

    public CharacterClass getCharacterClass() {
        return clas;
    }

    public Stats getAttributes() {
        return attributes;
    }

    @Override
    public void acceptOperation(DataElementVisitor visitor) {
        visitor.visit(this);
    }
}
