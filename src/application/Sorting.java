package application;

import java.util.ArrayList;

public class Sorting {
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
	
	public ArrayList<Country> countrySort(ArrayList<Country> list_2) {
		int y = list_2.size();
		for (int i = 0; y > i; i++) {
			for (int j = 0; y - 1 > j; j++) {
				if (list_2.get(j).getPoints() < list_2.get(j + 1).getPoints()) {
					list_2.add(j, list_2.get(j + 1));
					list_2.remove(j + 2);
				}
				else if (list_2.get(j).getPoints() == list_2.get(j + 1).getPoints()) {
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
