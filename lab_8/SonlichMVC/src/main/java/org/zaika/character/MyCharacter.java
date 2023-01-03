package org.zaika.character;

import org.zaika.character.classes.CharacterClass;
import org.zaika.character.race.CharacterRace;
import org.zaika.character.stats.Stats;

public class MyCharacter {
    private String name;
    private CharacterClass characterClass;
    private CharacterRace characterRace;
    private Stats attributes;

    public MyCharacter(String name, CharacterClass characterClass, CharacterRace characterRace) {
        this.name = name;
        this.characterClass = characterClass;
        this.characterRace = characterRace;
        attributes = new Stats();
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

    public CharacterMemento saveState() {
        return new CharacterMemento(name, characterRace, characterClass, attributes);
    }

    public void restoreState(CharacterMemento memento) {
        name = memento.name;
        characterRace = memento.characterRace;
        characterClass = memento.characterClass;
        attributes = memento.attributes;
    }

    public String getName() {
        return name;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public CharacterRace getCharacterRace() {
        return characterRace;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public void setCharacterRace(CharacterRace characterRace) {
        this.characterRace = characterRace;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }
}
