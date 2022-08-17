package application;

/**
 * @author Faiyaz Altaf Pranto
 * Child class Player, that inherits from the data class.
 */
public class Player extends Data {
	private String country;
	
	/**
	 * Constructor class for the player class.
	 * @param name: Name of the player
	 * @param country: Name of the country the player is playing for
	 * @param goals: Number of goals scored
	 */
	public Player(String name, String country, int goals) {
		// Inherits the variables name and goals from the parent class.
		super(name, goals);
		this.country = country;
	}
	
	/**
	 * Getter method inherited from the parent class.
	 * @return name of the player
	 */
	public String getName() {
		return super.getName();
	}
	
	/**
	 * Setter method inherited from the parent class.
	 * @param name2
	 */
	public void setName(String name2) {
		super.setName(name2);
	}
	
	/**
	 * Getter method inherited from the parent class.
	 * @return number of goals scored
	 */
	public int getGoals() {
		return super.getGoals();
	}
	
	/**
	 * Setter method inherited from the parent class.
	 * @param goals2
	 */
	public void setGoals(int goals2) {
		super.setGoals(goals2);
	}
	
	/**
	 * Adds goals after every update, inherited from the parent class.
	 * @param goalsUpdate
	 */
	public void addGoals(int goalsUpdate) {
		super.addGoals(goalsUpdate);
	}
	
	/**
	 * Getter method for the country of the player.
	 * @return name of the country the player plays for
	 */
	public String getCountry() {
		return this.country;
	}
	
	/**
	 * Setter method for the country of the player.
	 * @param country2
	 */
	public void setCountry(String country2) {
		this.country = country2;
	}

}
