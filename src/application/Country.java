package application;

public class Country extends Data{
	private int matchesWon;
	private int matchesDrawn;
	private int points;

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
	
	public int getPoints() {
		return this.points;
	}
	
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

	public int getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(int matchesWon2) {
		this.matchesWon = matchesWon2;
	}

}