package org.zaika.memento;

public class Character {
    private String name;
    private String race;
    private String dndClass;
    private Stats attributes;

    Character(String name,  String race, String dndClass) {
        this.name = name;
        this.race = race;
        this.dndClass = dndClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDndClass() {
        return dndClass;
    }

    public void setDndClass(String dndClass) {
        this.dndClass = dndClass;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }

    public void characterInfo() {
        System.out.println("name: " + name + '\n' +
                "race: " + race + '\n' +
                "class: " + dndClass + '\n' +
                "------------------------------" + '\n');
        attributes.print();
    }
}
