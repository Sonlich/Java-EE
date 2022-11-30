package org.zaika.visitor;

import org.zaika.visitor.classes.Barbarian;
import org.zaika.visitor.character.Character;
import org.zaika.visitor.race.Dwarf;
import org.zaika.visitor.visitor.DataElementVisitor;
import org.zaika.visitor.visitor.ElementConsoleVisitor;
import org.zaika.visitor.visitor.ElementSaverVisitor;
import org.zaika.visitor.json.JsonSaver;

import java.util.TreeMap;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Character character = new Character("Muradin BronzeBeard", new Dwarf(), new Barbarian());

        ElementSaverVisitor saver = new ElementSaverVisitor();

        character.acceptOperation(saver);
        character.getCharacterClass().acceptOperation(saver);
        character.getCharacterRace().acceptOperation(saver);
        character.getAttributes().acceptOperation(saver);


        TreeMap<String, String> treeMap = saver.getTreeMap();

        DataElementVisitor dataElementVisitor = new ElementConsoleVisitor();
        character.acceptOperation(dataElementVisitor);
        character.getCharacterClass().acceptOperation(dataElementVisitor);
        character.getAttributes().acceptOperation(dataElementVisitor);
        character.getCharacterRace().acceptOperation(dataElementVisitor);


        JsonSaver jsonSaver = new JsonSaver();
        jsonSaver.write("lab_7/src/main/resources/test.json", treeMap);
    }
}