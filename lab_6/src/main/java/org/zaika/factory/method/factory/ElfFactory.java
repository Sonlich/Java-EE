package org.zaika.factory.method.factory;

import org.zaika.factory.method.race.CharacterRace;
import org.zaika.factory.method.race.Elf;

public class ElfFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create() {
        return new Elf();
    }
}
