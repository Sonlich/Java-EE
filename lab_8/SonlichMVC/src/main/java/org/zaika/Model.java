package org.zaika;

import org.json.JSONObject;
import org.zaika.character.CharacterMemento;
import org.zaika.character.MyCharacter;
import org.zaika.character.classes.ClassAbstractFactory;
import org.zaika.character.race.RaceAbstractFactory;

import java.io.FileWriter;
import java.io.IOException;

public class Model {

    private MyCharacter character = null;
    private CharacterMemento memento = null;

    public void generateCharacter(String name, String raceType, String classType) {
        if (character != null) {
            memento = character.saveState();
        }
        character = new MyCharacter(
                name,
                ClassAbstractFactory.getClass(classType),
                RaceAbstractFactory.getClass(raceType)
        );
    }

    public void revertCharacter() {
        if (memento == null) {
            throw new IllegalArgumentException("Немає попереднього стану!"); //@TODO
        }
        character.restoreState(memento);
    }

    public void saveCharacter() throws IOException {
        if (character == null) {
            throw new IllegalArgumentException("Персонаж не створений!"); //@TODO
        }

        JSONObject chObj = new JSONObject();
        chObj.put("name", character.getName());
        chObj.put("race", character.getCharacterRace().getRaceName());
        chObj.put("class", character.getCharacterClass().getClassName());
        chObj.put("strength", character.getAttributes().getStrength());
        chObj.put("dexterity", character.getAttributes().getDexterity());
        chObj.put("constitution", character.getAttributes().getConstitution());
        chObj.put("intelligence", character.getAttributes().getIntelligence());
        chObj.put("wisdom", character.getAttributes().getWisdom());
        chObj.put("charisma", character.getAttributes().getCharisma());
        try {
            FileWriter file = new FileWriter("character.json");
            file.write(chObj.toString());
            file.flush();
            file.close();
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    public MyCharacter getCharacter() {
        return character;
    }
}
