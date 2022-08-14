package application;

public class Data {
	private String name;
	private int goals;
	
	public Data(String name, int goals) {
		this.name = name;
		String name_2 = name;
		
		int goals_2 = Integer.valueOf(this.goals);
		this.goals = goals_2;
	}
	
	public String toString() {
		return this.name;
	}
	
}
