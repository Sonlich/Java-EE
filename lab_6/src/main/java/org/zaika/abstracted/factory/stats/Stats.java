package org.zaika.abstracted.factory.stats;

import java.util.HashMap;

public record Stats() {
    private static HashMap<String, Integer> stats;

    public Stats(){
        stats = new HashMap<>();
    }

    public static Stats generate() {
        Stats stats = new Stats();

        Stats.stats.put("strength",  Dice.rollStats());
        Stats.stats.put("dexterity",  Dice.rollStats());
        Stats.stats.put("constitution", Dice.rollStats());
        Stats.stats.put("intelligence", Dice.rollStats());
        Stats.stats.put("wisdom", Dice.rollStats());
        Stats.stats.put("charisma", Dice.rollStats());

        return stats;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

}