package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{

    @FXML
    Label lblLabel;
    private final StringProperty textValue = new SimpleStringProperty("waiting for input");

    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        System.out.println("You clicked me!");

        setTextValue("button clicked");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        //TODO Uncomment this  to activate the binding in code
        //remember to also uncoment out the fxml label
        //  lblLabel.textProperty().bind(textValueProperty());

    }

    public String getTextValue()
    {
        return textValue.get();
    }

    public StringProperty textValueProperty()
    {
        return textValue;
    }

    public void setTextValue(String textValue)
    {
        this.textValue.set(textValue);
    }


}
