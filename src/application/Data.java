package application;

/**
 * @author Faiyaz Altaf Pranto
 * The parent class - Data, containing the common variables names and goals.
 */
public class Data {
	// Encapsulation of instance variables to prevent privacy leak
	protected String name;
	protected int goals;
	
	/**
	 * Constructor of the parent class.
	 * @param name: Name of the player or country
	 * @param goals: Total goals scored
	 */
	public Data(String name, int goals) {
		String name_2 = name;
		this.name = name_2;
		
		int goals_2 = Integer.valueOf(goals);
		this.goals = goals_2;
	}
	
	/**
	 * Getter for the name variable.
	 * @return Name of the country or player
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Setter for the name variable.
	 * @param name2
	 */
	public void setName(String name2) {
		this.name = name2;
	}
	
	/**
	 * Getter for the goals variable.
	 * @return Total goals scored
	 */
	public int getGoals() {
		return this.goals;
	}
	
	/**
	 * Setter for the goals variable.
	 * @param goals2
	 */
	public void setGoals(int goals2) {
		this.goals = goals2;
	}
	
	/**
	 * Method to update the number of goals scored. 
	 * @param goalsUpdated: Number of goals to add to the total goals
	 */
	public void addGoals(int goalsUpdated) {
		this.goals += goalsUpdated;
	}
	
	/**
	 * @return the name of the player or country as a string.
	 */
	public String toString() {
		return this.name;
	}
	
}
