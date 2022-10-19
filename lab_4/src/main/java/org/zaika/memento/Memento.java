package org.zaika.memento;

public class Memento {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Memento(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Memento() {

    }

    public void setState(Stats state) {
        this.strength = state.strength();
        this.dexterity = state.dexterity();
        this.constitution = state.constitution();
        this.intelligence = state.intelligence();
        this.wisdom = state.wisdom();
        this.charisma = state.charisma();
    }

    public Stats getStats() {
        return new Stats(
                strength,
                dexterity,
                constitution,
                intelligence,
                wisdom,
                charisma);
    }

    public Memento copy(){
        return new Memento(strength, dexterity, constitution, intelligence, wisdom, charisma);
    }
}
