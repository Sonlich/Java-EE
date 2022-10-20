package org.zaika.factory.method.stats;

import java.util.HashMap;
public class Stats {
    private final HashMap<String, Integer> stats;

    private Stats() {
        stats = new HashMap<>();
    }

    public Stats(int strength,
                 int dexterity,
                 int constitution,
                 int intelligence,
                 int wisdom,
                 int charisma) {
        stats = new HashMap<>();

        stats.put("strength", strength);
        stats.put("dexterity", dexterity);
        stats.put("constitution", constitution);
        stats.put("intelligence", intelligence);
        stats.put("wisdom", wisdom);
        stats.put("charisma", charisma);
    }

    public static Stats generate() {
        Stats stats = new Stats();

        stats.stats.put("strength",  Dice.rollStats());
        stats.stats.put("dexterity",  Dice.rollStats());
        stats.stats.put("constitution", Dice.rollStats());
        stats.stats.put("intelligence", Dice.rollStats());
        stats.stats.put("wisdom", Dice.rollStats());
        stats.stats.put("charisma", Dice.rollStats());

        return stats;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }
}

