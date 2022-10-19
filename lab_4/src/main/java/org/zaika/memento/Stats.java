package org.zaika.memento;

public record Stats(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
    public static Stats generate() {
        return new Stats(
                Dise.rollStats(),
                Dise.rollStats(),
                Dise.rollStats(),
                Dise.rollStats(),
                Dise.rollStats(),
                Dise.rollStats()
        );
    }


    public void print() {
        System.out.println("ATRIBUTES" + '\n' +
                "strength: " + strength + '\n' +
                "dexterity: " + dexterity + '\n' +
                "constitution: " + constitution + '\n' +
                "intelligence: " + intelligence + '\n' +
                "wisdom: " + wisdom + '\n' +
                "charisma: " + charisma + '\n' +
                "-----------------------------------------------" + '\n'
        );
    }
}
