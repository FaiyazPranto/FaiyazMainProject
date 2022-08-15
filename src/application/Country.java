package application;

public class Country extends Data{
	private int matchesWon;
	private int matchesDrawn;
	private double points;

	public Country(String name, int matchesWon, int matchesDrawn, int goals) {
		super(name, goals);
		this.matchesWon = matchesWon;
		this.matchesDrawn = matchesDrawn;
		
		this.points = (3 * this.matchesWon) + (1 * this.matchesDrawn);
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

	public int getMatchesDrawn() {
		return matchesDrawn;
	}

	public void setMatchesDrawn(int matchesDrawn2) {
		this.matchesDrawn = matchesDrawn2;
	}
	
	public double getPoints() {
		return this.points;
	}
	
	public void updateResult(String result) {
		if (result.equals("Win")) {
			matchesWon += 1;
		}
		else if (result.equals("Draw")) {
			matchesDrawn += 1;
		}
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(int matchesWon2) {
		this.matchesWon = matchesWon2;
	}

}