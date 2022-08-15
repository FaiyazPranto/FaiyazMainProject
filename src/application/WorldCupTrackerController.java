package application;

import java.util.ArrayList;

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
    private TextField goalsScoredTextfield;

    @FXML
    private TextField updatePlayerTextfield;

    @FXML
    private Slider goalsSlider;
    
    @FXML
    private TextArea outputTextArea;
    
    @FXML
    private Slider countryGoalsSlider;
    
    
    ArrayList<Player> playerData = new ArrayList();
    ArrayList<Country> countryData = new ArrayList();
    

    @FXML
    void addCountry(ActionEvent event) {
    	String name = countryNameTextfield.getText().toUpperCase();
    	int matchesWon = Integer.parseInt(matchesWonTextfield.getText());
    	int matchesDrawn = Integer.parseInt(matchesDrawnTextfield.getText());
    	int totalGoals = Integer.parseInt(countryGoalsTextfield.getText());
    	
    	countryData.add(new Country(name, matchesWon, matchesDrawn, totalGoals));
    	
    	countryNameTextfield.clear();
    	matchesWonTextfield.clear();
    	matchesDrawnTextfield.clear();
    }

    @FXML
    void addPlayer(ActionEvent event) {
    	String name = playerNameTextfield.getText().toUpperCase();
    	String country = playersCountryTextfield.getText().toUpperCase();
    	int goals = Integer.parseInt(goalsScoredTextfield.getText());
    	
    	playerData.add(new Player(name, country, goals));
    	
    	playerNameTextfield.clear();
    	playersCountryTextfield.clear();
    	goalsScoredTextfield.clear();
    }

    @FXML
    void updateCountry(ActionEvent event) {
    	String name = updateCountryTextfield.getText().toUpperCase();
    	String matchResult = resultChoicebox.getValue();
    	int goalsScored = (int) countryGoalsSlider.getValue();
    	
    	for (Country i: countryData) {
    		if (i.getName().equals(name)) {
    			i.addGoals(goalsScored);
    			i.updateResult(matchResult);
    		}
    	}
    }

    @FXML
    void updatePlayer(ActionEvent event) {
    	String name = updatePlayerTextfield.getText();
    	int goalsScored = (int) goalsSlider.getValue();   	
    	
    	for (Player j: playerData) {
    		if (j.getName().equals(name)) {
    			j.addGoals(goalsScored); 
    		}
    	}
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
