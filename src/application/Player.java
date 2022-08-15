package application;

public class Player extends Data {
	private String country;
	
	public Player(String name, String country, int goals) {
		super(name, goals);
		this.country = country;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public void setName(String name2) {
		super.setName(name2);
	}
	
	public int getGoals() {
		return super.getGoals();
	}
	
	public void setGoals(int goals2) {
		super.setGoals(goals2);
	}
	
	public void addGoals(int goalsUpdate) {
		super.addGoals(goalsUpdate);
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country2) {
		this.country = country2;
	}

}
