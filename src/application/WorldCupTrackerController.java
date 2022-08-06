package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class WorldCupTrackerController {

    @FXML
    private TextField countryNameTextfield;

    @FXML
    private ChoiceBox<?> resultChoicebox;

    @FXML
    private TextField playerNameTextfield;

    @FXML
    private TextField playersOfCountriesTextfield;

    @FXML
    private TextField matchesWonTextfield;

    @FXML
    private TextField ageTextfield;

    @FXML
    private TextField displayAgeTextfield;

    @FXML
    private TextField updateCountryTextfield;

    @FXML
    private TextField matchesDrawnTextfield;

    @FXML
    private Slider assistSlider;

    @FXML
    private TextField goalsScoredTextfield;

    @FXML
    private TextField updatePlayerTextfield;

    @FXML
    private TextField assistsTextfield;

    @FXML
    private Slider goalsSlider;

    @FXML
    void addCountry(ActionEvent event) {
    	String name = countryNameTextfield.getText().toUpperCase();
    	int matchesWon = Integer.parseInt(matchesWonTextfield.getText());
    	int matchesDrawn = Integer.parseInt(matchesDrawnTextfield.getText());
    	
    	countryNameTextfield.clear();
    	matchesWonTextfield.clear();
    	matchesDrawnTextfield.clear();
    }

    @FXML
    void addPlayer(ActionEvent event) {
    	String name = playerNameTextfield.getText().toUpperCase();
    	int age = Integer.parseInt(ageTextfield.getText());
    	int goals = Integer.parseInt(goalsScoredTextfield.getText());
    	int assists = Integer.parseInt(assistsTextfield.getText());
    }

    @FXML
    void updateCountry(ActionEvent event) {
    	String name = updateCountryTextfield.getText().toUpperCase();
    	Object matchResult = resultChoicebox.getValue();
    }

    @FXML
    void updatePlayer(ActionEvent event) {
    	String name = updatePlayerTextfield.getText();
    	double goalsScored = goalsSlider.getValue();
    	double numAssists = assistSlider.getValue();

    	int goals = (int)goalsScored;
    	int assists = (int)numAssists;
    	
    }

    @FXML
    void viewTopCountries(ActionEvent event) {

    }

    @FXML
    void viewTopPlayers(ActionEvent event) {

    }

    @FXML
    void viewPlayersOfCountries(ActionEvent event) {

    }

    @FXML
    void viewCertainAge(ActionEvent event) {

    }

    @FXML
    void viewAllCountries(ActionEvent event) {

    }

    @FXML
    void viewAllPlayers(ActionEvent event) {

    }

}
