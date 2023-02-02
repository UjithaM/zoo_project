package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class AddAnimalController {
    public  TextField animalId;
    public TextField animalName;
    public TextField animalAge;
    public DatePicker animalBornDate;
    public DatePicker animalDethDate;
//    public ComboBox animalType;
    public TextField healthRecode;

    public void addAnimal(ActionEvent actionEvent) {
        try {
            System.out.println("done");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateAnimal(ActionEvent actionEvent) {
        try {
            System.out.println("Update");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteAnimal(ActionEvent actionEvent) {
        try {
            System.out.println("Delete");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
