package application;

public class Country extends Data{
	private int matchesWon;
	private int matchesDrawn;

	public Country(String name, int matchesWon, int matchesDrawn, int goals) {
		super(name, goals);
		this.setMatchesWon(matchesWon);
		this.setMatchesDrawn(matchesDrawn);
	}
	
	public String getName() {
		return super.getName();
	}
	
	public int getGoals() {
		return super.getGoals();
	}
	
	public void setGoals(int goals) {
		super.setGoals(goals);
	}
	
	public void addGoals(int goals) {
		super.addGoals(goals);
	}

	public int getMatchesDrawn() {
		return matchesDrawn;
	}

	public void setMatchesDrawn(int matchesDrawn) {
		this.matchesDrawn = matchesDrawn;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

}