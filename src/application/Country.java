package application;

/**
 * @author Faiyaz Altaf Pranto
 * Child class Country, that inherits from Data class
 */
public class Country extends Data{
	private int matchesWon;
	private int matchesDrawn;
	private int points;

	/**
	 * Constructor for the Country class.
	 * @param name: Name of the country.
	 * @param matchesWon: Number of matches won.
	 * @param matchesDrawn: Number of matches drawn.
	 * @param goals: Number of goals scored.
	 */
	public Country(String name, int matchesWon, int matchesDrawn, int goals) {
		// Inherit the name and goals variables from the data class.
		super(name, goals);
		this.matchesWon = matchesWon;
		this.matchesDrawn = matchesDrawn;
		
		// A point system for the ranking, 1 win = 3 points and 1 draw = 1 point.
		this.points = (3 * this.matchesWon) + (1 * this.matchesDrawn);
	}
	
	/**
	 * Getter method inherited from the Data class.
	 * @return Name of the country
	 */
	public String getName() {
		return super.getName();
	}
	
	/**
	 * Setter method inherited from the Data class.
	 * @param name2
	 */
	public void setName(String name2) {
		super.setName(name2);
	}
	
	/**
	 * Getter method inherited from the Data class.
	 * @return Number of Goals scored.
	 */
	public int getGoals() {
		return super.getGoals();
	}
	
	/**
	 * Setter method inherited from the Data class.
	 * @param goals2
	 */
	public void setGoals(int goals2) {
		super.setGoals(goals2);
	}
	
	/**
	 * Method to update the goals using inheritance.
	 * @param goalsUpdate
	 */
	public void addGoals(int goalsUpdate) {
		super.addGoals(goalsUpdate);
	}
	
	/**
	 * Getter method for matches drawn.
	 * @return matchesDrawn
	 */
	public int getMatchesDrawn() {
		return matchesDrawn;
	}
	
	/**
	 * Setter method for matches drawn.
	 * @param matchesDrawn2
	 */
	public void setMatchesDrawn(int matchesDrawn2) {
		this.matchesDrawn = matchesDrawn2;
	}
	
	/**
	 * Getter method for points.
	 * @return total points
	 */
	public int getPoints() {
		return this.points;
	}
	
	/**
	 * Updates the result form the choices presented in the choice box.
	 * @param result
	 */
	public void updateResult(String result) {
		if (result.equals("W")) {
			this.matchesWon += 1;
			this.points += 3;
		}
		else if (result.equals("D")) {
			this.matchesDrawn += 1;
			this.points += 1;
		}
	}

	/**
	 * Getter method for matchesWon.
	 * @return the number of matches drawn
	 */
	public int getMatchesWon() {
		return matchesWon;
	}

	/**
	 * Setter method for matchesWon
	 * @param matchesWon2
	 */
	public void setMatchesWon(int matchesWon2) {
		this.matchesWon = matchesWon2;
	}

}