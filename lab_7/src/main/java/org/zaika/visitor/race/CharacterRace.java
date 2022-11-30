package org.zaika.visitor.race;

import org.zaika.visitor.stats.Stats;
import org.zaika.visitor.visitor.DataElement;

public abstract class CharacterRace implements DataElement {

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

