package org.zaika.character.race;

import org.zaika.character.stats.Stats;

public abstract class CharacterRace {
    protected String name;
    protected Stats bonuses;

    public Stats getRaceBonuses() {
        return bonuses;
    }
    public String getRaceName() {
        return name;
    }
    public abstract void saySMTH();
}
