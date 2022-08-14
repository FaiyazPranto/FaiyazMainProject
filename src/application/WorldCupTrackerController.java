package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WorldCupTrackerController {

    @FXML
    private TextField countryNameTextfield;

    @FXML
    private ChoiceBox<String> resultChoicebox;

    @FXML
    private TextField playerNameTextfield;

    @FXML
    private TextField playersOfCountriesTextfield;

    @FXML
    private TextField matchesWonTextfield;

    @FXML
    private TextField playersCountryTextfield;

    @FXML
    private TextField countryGoalsTextfield;

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
    private Slider goalsSlider;
    
    @FXML
    private TextArea outputTextArea;

    @FXML
    void addCountry(ActionEvent event) {
    	String name = countryNameTextfield.getText().toUpperCase();
    	int matchesWon = Integer.parseInt(matchesWonTextfield.getText());
    	int matchesDrawn = Integer.parseInt(matchesDrawnTextfield.getText());
    	int totalGoals = Integer.parseInt(countryGoalsTextfield.getText());
    	
    	Country countryData = new Country(name, matchesWon, matchesDrawn, totalGoals);
    	
    	countryNameTextfield.clear();
    	matchesWonTextfield.clear();
    	matchesDrawnTextfield.clear();
    }

    @FXML
    void addPlayer(ActionEvent event) {
    	String name = playerNameTextfield.getText().toUpperCase();
    	String country = playersCountryTextfield.getText().toUpperCase();
    	int goals = Integer.parseInt(goalsScoredTextfield.getText());
    	
    	Player playerData = new Player(name, country, goals);
    }

    @FXML
    void updateCountry(ActionEvent event) {
    	String name = updateCountryTextfield.getText().toUpperCase();
    	String matchResult = resultChoicebox.getValue();
    }

    @FXML
    void updatePlayer(ActionEvent event) {
    	String name = updatePlayerTextfield.getText();
    	int goalsScored = (int) goalsSlider.getValue();
    	int numAssists = (int) assistSlider.getValue();    	
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
    void viewAllCountries(ActionEvent event) {

    }

    @FXML
    void viewAllPlayers(ActionEvent event) {

    }

}
