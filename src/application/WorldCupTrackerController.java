package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

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
    	try {
    		outputTextArea.clear();
    		
	    	String name = countryNameTextfield.getText().toUpperCase();
	    	int matchesWon = Integer.parseInt(matchesWonTextfield.getText());
	    	int matchesDrawn = Integer.parseInt(matchesDrawnTextfield.getText());
	    	int totalGoals = Integer.parseInt(countryGoalsTextfield.getText());
	    	
	    	Boolean check = true;
	    	for (Country i: countryData) {
    			if (i.getName().equals(name)) {
    				check = false;
    			}
    		}
	    	
	    	if (check == true) {
		    	if (matchesWon < 0 || matchesDrawn < 0 || totalGoals < 0) {
		    		outputTextArea.setText("Matches Won, Matches Drawn and Total Goals cannot be a negative value.");
		    	}
		    	else {	    	
			    	countryData.add(new Country(name, matchesWon, matchesDrawn, totalGoals));
			    	
			    	countryNameTextfield.clear();
			    	matchesWonTextfield.clear();
			    	matchesDrawnTextfield.clear();
			    	countryGoalsTextfield.clear();
		    	}
	    	}
	    	else {
	    		outputTextArea.setText("The country has already been added.");
	    	}
    	}
    	catch(NumberFormatException e) {
    		outputTextArea.setText("Please use proper values for Matches Won, Matches Drawn and Total Goals.");
    	}
    	catch(NullPointerException e) {
    		outputTextArea.setText("Please provide proper values.");
    	}
    }

    @FXML
    void addPlayer(ActionEvent event) {
    	try {
	    	String name = playerNameTextfield.getText().toUpperCase();
	    	String country = playersCountryTextfield.getText().toUpperCase();
	    	int goals = Integer.parseInt(goalsScoredTextfield.getText());
	    	
	    	if (goals < 0) {
	    		outputTextArea.setText("Goals Scored cannot be a negative value.");
	    	}
		    else {	    	
		    	playerData.add(new Player(name, country, goals));
		    	
		    	playerNameTextfield.clear();
		    	playersCountryTextfield.clear();
		    	goalsScoredTextfield.clear();
		    }
    	}
    	catch(NumberFormatException e) {
    		outputTextArea.setText("Please use proper values for Goals Scored.");
    	}
    	catch(NullPointerException e) {
    		outputTextArea.setText("Please provide proper values.");
    	}
    }

    @FXML
    void updateCountry(ActionEvent event) {
    	try {
	    	String name = updateCountryTextfield.getText().toUpperCase();
	    	String matchResult = resultChoicebox.getValue();
	    	int goalsScored = (int) countryGoalsSlider.getValue();
	    	boolean check = false;
	    	
	    	for (Country i: countryData) {
	    		if (i.getName().equals(name)) {
	    			i.addGoals(goalsScored);
	    			i.updateResult(matchResult);
	    			check = true;
	    		}
	    	}
	    	
    		if (check == false) {
    			outputTextArea.setText("There is no country that matches the input");
    		}
    		
	    	updateCountryTextfield.clear();
    	}
    	catch(NullPointerException e) {
    		outputTextArea.setText("Please provide proper values.");
    	}
    }

    @FXML
    void updatePlayer(ActionEvent event) {
    	try {
	    	String name = updatePlayerTextfield.getText().toUpperCase();
	    	int goalsScored = (int) goalsSlider.getValue();   	
	    	boolean check = false;
	    	
	    	for (Player j: playerData) {	    		
	    		if (j.getName().equals(name)) {
	    			j.addGoals(goalsScored); 
	    			check = true;
	    		}
	    	}
	    	
	    	if (check == false)	{
		 	    outputTextArea.setText("There is no player that matches the input.");
		    }
	    	
	    	updatePlayerTextfield.clear();
    	}
    	catch(NullPointerException e) {
    		outputTextArea.setText("Please provide proper values.");
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
    	outputTextArea.clear();
    	
    	String country = playersOfCountriesTextfield.getText().toUpperCase();
    	ArrayList<String> playerCountryList = new ArrayList<String>();
    	String output = "";
    	
    	for (Player i: playerData) {
    		if (country.equals(i.getCountry())) {
    			playerCountryList.add(i.getName());
    		}
    	}
    	playerCountryList.sort(null);
    	outputTextArea.setText(playerCountryList.toString());
    	
    	for (String name : playerCountryList) {
    		output += name + "\n";
    	}
    }

    @FXML
    void viewAllCountries(ActionEvent event) {
    	outputTextArea.clear();
    	
    	String output = "";
    	ArrayList <String> countryList = new ArrayList<String>();
    	for (Country index : countryData) {
    		countryList.add(index.getName());
    	}
    	countryList.sort(null);
    	
    	for (String name : countryList) {
    		output += name + "\n";
    	}
    	
    	outputTextArea.setText(output);
    }

    @FXML
    void viewAllPlayers(ActionEvent event) {
    	outputTextArea.clear();
    	
    	String output = "";
    	ArrayList<String> playerList = new ArrayList<String>();
    	for (Player index : playerData) {
    		playerList.add(index.getName() + " (" + index.getCountry() + ")");    		
    	}
    	playerList.sort(null);
    	
    	for (String name : playerList) {
    		output += name + "\n";
    	}
    	
    	outputTextArea.setText(output);
    }

}
