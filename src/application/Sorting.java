package application;

import java.util.ArrayList;

/**
 * @author Faiyaz Altaf Pranto
 * Sorting class made for data manipulation of the inputs and arrange them as a ranking.
 */
public class Sorting {
	
	/**
	 * Sorting function for the players, arranged according to the number of goals scored.
	 * @param list: the list of players
	 * @return the list after ranking it accordingly
	 */
	public ArrayList<Player> playerSort(ArrayList<Player> list) {
		int x = list.size();
		for (int i = 0; x > i; i++) {
			for (int j = 0; x - 1 > j; j++) {
				if (list.get(j).getGoals() < list.get(j + 1).getGoals()) {
					list.add(j, list.get(j + 1));
					list.remove(j + 2);
				}
			}
		}
		
		return list;
	}
	
	/**
	 *  Sorting function for the countries, arranged according to the total points earned.
	 * @param list_2: the list of countries
	 * @return the list after ranking it accordingly
	 */
	public ArrayList<Country> countrySort(ArrayList<Country> list_2) {
		int y = list_2.size();
		for (int i = 0; y > i; i++) {
			for (int j = 0; y - 1 > j; j++) {
				if (list_2.get(j).getPoints() < list_2.get(j + 1).getPoints()) {
					list_2.add(j, list_2.get(j + 1));
					list_2.remove(j + 2);
				}
				else if (list_2.get(j).getPoints() == list_2.get(j + 1).getPoints()) {
					// If the number of points are the same, rank the countries with the number of goals scored.
					if (list_2.get(j).getGoals() < list_2.get(j + 1).getGoals()) {
						list_2.add(j, list_2.get(j + 1));
						list_2.remove(j + 2);
					}
				}
			}
		}
		
		return list_2;
	}
}
