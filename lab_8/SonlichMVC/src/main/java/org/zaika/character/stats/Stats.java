package org.zaika.character.stats;

import java.util.HashMap;

public class Stats {

    private HashMap<String, Integer> stats;

    public Stats() {
        stats = new HashMap<>();

        stats.put("strength",  Dice.rollStats());
        stats.put("dexterity",  Dice.rollStats());
        stats.put("constitution", Dice.rollStats());
        stats.put("intelligence", Dice.rollStats());
        stats.put("wisdom", Dice.rollStats());
        stats.put("charisma", Dice.rollStats());
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    public int getStrength() {
        return stats.get("strength");
    }

    public int getDexterity() {
        return stats.get("dexterity");
    }

    public int getConstitution() {
        return stats.get("constitution");
    }

    public int getIntelligence() {
        return stats.get("intelligence");
    }

    public int getWisdom() {
        return stats.get("wisdom");
    }

    public int getCharisma() {
        return stats.get("charisma");
    }
}