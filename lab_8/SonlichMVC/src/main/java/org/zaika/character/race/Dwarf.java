package org.zaika.character.race;

import org.zaika.character.stats.Stats;

public class Dwarf extends CharacterRace {

    public Dwarf(){
        this.name = "Dwarf";
        this.bonuses = new Stats();
    }

    @Override
    public void saySMTH() {
        System.out.println("All dwarfs have only one question... Why can't we be drunk all the time?");
    }
}


