package org.zaika.visitor.race;

import org.zaika.visitor.stats.Stats;
import org.zaika.visitor.visitor.DataElementVisitor;

public class Dwarf extends CharacterRace{

    public Dwarf(){
        this.name = "Dwarf";
        this.bonuses = new Stats(0,0,2,0,1,0);
    }

    @Override
    public void saySMTH() {
        System.out.println("All dwarfs have only one question... Why can't we be drunk all the time?");
    }

    @Override
    public void acceptOperation(DataElementVisitor visitor) {
        visitor.visit(this);
    }
}


