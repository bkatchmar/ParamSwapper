package bjk.setarrange;

import java.util.Arrays;

public class InitializeSet {
	public static void main(String[] args) {
		String[] params = {"prep1", "prep2", "prep3", "prep4", "prep5"};
		SetOrganizer organizer = new SetOrganizer(params);
		
		for(int iterator = 0; iterator < organizer.getFinalList().size(); iterator++) {
			System.out.println(Arrays.toString(organizer.getFinalList().get(iterator)));
		}
	}
}