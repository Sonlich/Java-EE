package org.zaika.character.race;

public class RaceAbstractFactory {
    public static CharacterRace getClass(String type) {

        return switch (type) {
            case "Dwarf" -> new Dwarf();
            case "Elf" -> new Elf();
            default -> throw new IllegalArgumentException("Can`t find this type of race: " + type); //@TODO
        };

    }
}
