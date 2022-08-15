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
	
	public void setName(String name2) {
		this.name = name2;
	}
	
	public int getGoals() {
		return this.goals;
	}
	
	public void setGoals(int goals2) {
		this.goals = goals2;
	}
	
	public void addGoals(int goalsUpdated) {
		this.goals += goalsUpdated;
	}
	
	public String toString() {
		return this.name;
	}
	
}
