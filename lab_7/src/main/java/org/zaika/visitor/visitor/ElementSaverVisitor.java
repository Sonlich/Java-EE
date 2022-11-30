package org.zaika.visitor.visitor;

import org.zaika.visitor.character.Character;
import org.zaika.visitor.classes.CharacterClass;
import org.zaika.visitor.race.CharacterRace;
import org.zaika.visitor.stats.Stats;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ElementSaverVisitor implements DataElementVisitor {

    private final TreeMap<String, String> treeMap = new TreeMap<>();


    @Override
    public void visit(Character character) {
        treeMap.put("Name: ", character.getName());
    }

    @Override
    public void visit(CharacterClass characterClass) {
        treeMap.put("Class: ", characterClass.getClassName());
        treeMap.put("HP: ", String.valueOf(characterClass.getHp()));
    }

    @Override
    public void visit(Stats stats) {
        treeMap.putAll(stats.getStats().entrySet().stream().
                collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().toString()))
        );
    }

    @Override
    public void visit(CharacterRace race) {
        treeMap.put("Race: ", race.getRaceName());
        treeMap.putAll(race.getRaceBonuses().getStats().entrySet().stream().
                collect(Collectors.toMap(e -> "bonus of " + e.getKey(), e -> e.getValue().toString()))
        );
    }


    public TreeMap<String, String> getTreeMap() {
        return treeMap;
    }

}

