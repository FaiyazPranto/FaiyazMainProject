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
    
    
    // Created new lists to add the datasets for players and countries.
    
    ArrayList<Player> playerData = new ArrayList<Player>();
    ArrayList<Country> countryData = new ArrayList<Country>();
    
    /**
     * Adds a country to the list containing all the data inputs for the country.
     * @param event
     */
    
    @FXML
    void addCountry(ActionEvent event) {
    	try {
    		outputTextArea.clear();
    		
	    	String name = countryNameTextfield.getText().toUpperCase();
	    	int matchesWon = Integer.parseInt(matchesWonTextfield.getText());
	    	int matchesDrawn = Integer.parseInt(matchesDrawnTextfield.getText());
	    	int totalGoals = Integer.parseInt(countryGoalsTextfield.getText());
	    	
	    	
	    	// Checks if the data has already been added or not.
	    	Boolean check = true;
	    	for (Country i: countryData) {
    			if (i.getName().equals(name)) {
    				check = false;
    			}
    		}
	    	
	    	//Checks if the values are negative or not.
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
    	// Catches errors caused because of null and non-integer values.  
    	catch(NumberFormatException e) {
    		outputTextArea.setText("Please use proper values for Matches Won, Matches Drawn and Total Goals.");
    	}
    	catch(NullPointerException e) {
    		outputTextArea.setText("Please provide proper values.");
    	}
    }
    
    /**
     * Adds a player to the list containing all the data inputs for the player.
     * @param event
     */
    @FXML
    void addPlayer(ActionEvent event) {
    	try {
	    	outputTextArea.clear();
	    	
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

    /**
     * Updates the dataset containing the data for the specified country.
     * @param event
     */
    @FXML
    void updateCountry(ActionEvent event) {
    	try {
	    	outputTextArea.clear();
    		
	    	String name = updateCountryTextfield.getText().toUpperCase();
	    	String matchResult = resultChoicebox.getValue();
	    	int goalsScored = (int) countryGoalsSlider.getValue();
	    	boolean check = false;
	    	
	    	// Update the data only if the country has already been added.
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
    		else {
    			updateCountryTextfield.clear();
    		}
    	}
    	catch(NullPointerException e) {
    		outputTextArea.setText("Please provide proper values.");
    	}
    }

    /**
     * Updates the dataset containing the data for the specified player.
     * @param event
     */
    @FXML
    void updatePlayer(ActionEvent event) {
    	try {
	    	outputTextArea.clear();
	    	
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
	    	else {
	    		updatePlayerTextfield.clear();
	    	}
    	}
    	catch(NullPointerException e) {
    		outputTextArea.setText("Please provide proper values.");
    	}
    }

    /**
     * Displays the ranking of top countries after sorting them using the sorting class.
     * @param event
     */
    @FXML
    void viewTopCountries(ActionEvent event) {
    	outputTextArea.clear();
    	Sorting sorting = new Sorting();
    	
    	//Calls the sorting function from the sorting class.
		countryData = sorting.countrySort(countryData);
		
    	String output = "";
    	int index = 1;
    	
    	// Loops through the data of countries and list them accordingly.
    	for (Country i : countryData) {
    		output += index + ". " + i.getName() + " - " + i.getPoints() + " points (" + i.getMatchesWon() + " wins, " 
    				+ i.getMatchesDrawn() + " draws, " + i.getGoals() + " goals)\n";
    		index ++;
    	}
    	
    	outputTextArea.setText(output);
    }
    
    /**
     * Displays the ranking of top players after sorting them using the sorting class.
     * @param event
     */
    @FXML
    void viewTopPlayers(ActionEvent event) {
    	outputTextArea.clear();
    	Sorting sorting = new Sorting();
		playerData = sorting.playerSort(playerData);
		
    	String output = "";
    	int index = 1;
    	
    	for (Player i : playerData) {
    		output += index + ". " + i.getName() + " (" + i.getGoals() + " goals)\n";
    		index ++;
    	}
    	
    	outputTextArea.setText(output);
    }
    
    /**
     * Displays the list of all players of a specific country.
     * @param event
     */
    @FXML
    void viewPlayersOfCountries(ActionEvent event) {
    	outputTextArea.clear();
    	
    	String country = playersOfCountriesTextfield.getText().toUpperCase();
    	ArrayList<String> playerCountryList = new ArrayList<String>();
    	String output = "";
    	
    	// Adds all the players of the same country input to a list.
    	for (Player i: playerData) {
    		if (country.equals(i.getCountry())) {
    			playerCountryList.add(i.getName());
    		}
    	}
    	
    	// Sort the players in alphabetical order
    	playerCountryList.sort(null);
    	
    	for (String name : playerCountryList) {
    		output += name + "\n";
    	}
    	
    	outputTextArea.setText(output);
    }
    
    /**
     * Displays a list of all the countries added so far.
     * @param event
     */
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

    /**
     * Displays list of all the players added so far.
     * @param event
     */
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
