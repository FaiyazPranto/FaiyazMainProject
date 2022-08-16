package application;

import java.util.ArrayList;

public class Sorting {
	public void playerSort(ArrayList<Player> list) {
		for (int i = 0; list.size() > i; i ++) {
			for (int j = 0; list.size() - 1 > j; j++) {
				if (list.get(j).getGoals() > list.get(j + 1).getGoals()) {
					list.add(list.indexOf(j), list.get(j + 1));
				}
			}
		}
	}
}
