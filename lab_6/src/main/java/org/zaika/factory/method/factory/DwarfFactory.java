package org.zaika.factory.method.factory;

import org.zaika.factory.method.race.CharacterRace;
import org.zaika.factory.method.race.Dwarf;

public class DwarfFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create() {
        return new Dwarf();
    }
}
