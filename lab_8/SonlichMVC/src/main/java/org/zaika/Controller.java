package org.zaika;

import javafx.collections.FXCollections;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.zaika.character.stats.Stats;

import java.io.IOException;

public class Controller {
    private Model model;
    public TextField NameText;
    public TextField StrengthText;
    public TextField DexterityText;
    public TextField ConstitutionText;
    public TextField IntelligenceText;
    public TextField WisdomText;
    public TextField CharismaText;
    public Button Revert;
    public Button Generate;
    public Button Save;
    public ChoiceBox<String> Race;
    public ChoiceBox<String> Class;


    public void initialize() {
        var races = FXCollections.observableArrayList("Dwarf", "Elf");
        var classes = FXCollections.observableArrayList("Cleric", "Barbarian");

        Race.setItems(races);
        Race.setValue("Dwarf");

        Class.setItems(classes);
        Class.setValue("Cleric");

        model = new Model();
    }

    private void AttributesView() {
        Stats attributes = model.getCharacter().getAttributes();
        StrengthText.setText(Integer.toString(attributes.getStrength()));
        DexterityText.setText(Integer.toString(attributes.getDexterity()));
        ConstitutionText.setText(Integer.toString(attributes.getConstitution()));
        IntelligenceText.setText(Integer.toString(attributes.getIntelligence()));
        WisdomText.setText(Integer.toString(attributes.getWisdom()));
        CharismaText.setText(Integer.toString(attributes.getCharisma()));
        Race.setValue(model.getCharacter().getCharacterRace().getRaceName());
        Class.setValue(model.getCharacter().getCharacterClass().getClassName());
        NameText.setText(model.getCharacter().getName());
    }

    public void revert(MouseEvent mouseEvent) {
        try {
            model.revertCharacter();
            AttributesView();
        } catch (IllegalArgumentException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("No info about character");
            alert.setContentText("The character hadn't been generated");
            alert.showAndWait();
        }
    }

    public void generate(MouseEvent mouseEvent) {

        if (NameText.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Empty field");
            alert.setContentText("All field must be filled");
            alert.showAndWait();
            return;
        }
        model.generateCharacter(NameText.getText(), Race.getValue(), Class.getValue());
        AttributesView();
    }

    public void save(MouseEvent mouseEvent) {

        try {
            model.saveCharacter();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("INFO");
            alert.setHeaderText("Saving");
            alert.setContentText("The file has been saved succesfully");
            alert.showAndWait();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Impossible to save the file");
            alert.setContentText("It's impossible to save the file. Please try again");
            alert.showAndWait();
        } catch (IllegalArgumentException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("No info about character");
            alert.setContentText("The character hadn't been generated");
            alert.showAndWait();
        }
    }
}
