package org.zaika.character.classes;

public class ClassAbstractFactory {

    public static CharacterClass getClass(String type) {

        return switch (type) {
            case "Cleric" -> new Cleric();
            case "Barbarian" -> new Barbarian();
            default -> throw new IllegalArgumentException("Can`t find this type of class: " + type); //@TODO
        };

    }
}