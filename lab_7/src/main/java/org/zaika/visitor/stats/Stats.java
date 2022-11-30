package org.zaika.visitor.stats;
import org.zaika.visitor.visitor.DataElement;
import org.zaika.visitor.visitor.DataElementVisitor;

import java.util.HashMap;
import java.util.Map;

public class Stats implements DataElement {
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

    public Map<String, Integer> getStats() {
        return stats;
    }


    @Override
    public void acceptOperation(DataElementVisitor visitor) {
        visitor.visit(this);
    }
}

