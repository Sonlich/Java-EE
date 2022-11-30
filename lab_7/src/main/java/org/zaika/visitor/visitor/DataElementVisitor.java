package org.zaika.visitor.visitor;

import org.zaika.visitor.character.Character;
import org.zaika.visitor.classes.CharacterClass;
import org.zaika.visitor.race.CharacterRace;
import org.zaika.visitor.stats.Stats;

public interface DataElementVisitor {
    void visit(Character character);
    void visit(CharacterClass characterClass);
    void visit(Stats stats);
    void visit(CharacterRace characterRace);
}