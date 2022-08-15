package application;

public class Data {
	protected String name;
	protected int goals;
	
	public Data(String name, int goals) {
		String name_2 = name;
		this.name = name_2;
		
		int goals_2 = Integer.valueOf(this.goals);
		this.goals = goals_2;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getGoals() {
		return this.goals;
	}
	
	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	public void addGoals(int goals) {
		this.goals += goals;
	}
	
	public String toString() {
		return this.name;
	}
	
}
