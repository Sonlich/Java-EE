package org.zaika.visitor.classes;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        return switch (type) {
            case "Cleric" -> new Cleric();
            case "Barbarian" -> new Barbarian();
            default -> throw new IllegalArgumentException("This type doesn't exist");
        };
    }
}
