package org.zaika.character;

import org.zaika.character.classes.CharacterClass;
import org.zaika.character.race.CharacterRace;
import org.zaika.character.stats.Stats;

public class CharacterMemento {

    public String name;
    public CharacterRace characterRace;
    public CharacterClass characterClass;
    public Stats attributes;

    public CharacterMemento(
            String name,
            CharacterRace characterRace,
            CharacterClass characterClass,
            Stats attributes
    ) {
        this.name = name;
        this.characterRace = characterRace;
        this.characterClass = characterClass;
        this.attributes = attributes;
    }
}
