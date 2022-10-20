package org.zaika.factory.method.race;

import org.zaika.factory.method.stats.Stats;

public class Dwarf extends CharacterRace{

    public Dwarf(){
        this.name = "Dwarf";
        this.bonuses = new Stats(0,0,2,0,1,0);
    }

    @Override
    public void saySMTH() {
        System.out.println("All dwarfs have only one question... Why can't we be drunk all the time?");
    }
}


