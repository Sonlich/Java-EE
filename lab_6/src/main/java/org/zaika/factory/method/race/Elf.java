package org.zaika.factory.method.race;

import org.zaika.factory.method.stats.Stats;

public class Elf extends CharacterRace {
    public Elf() {
        this.name = "Elf";
        this.bonuses = new Stats(0, 2, 0, 1, 0, 0);
    }

    @Override
    public void saySMTH() {
        System.out.println("We elves live in forests. What the...? How long have I had these leaves in my hair? And no one will tell!");
    }

}
