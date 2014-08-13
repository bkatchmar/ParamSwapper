package bjk.setarrange;

import java.util.ArrayList;

public class SetOrganizer {
	private ArrayList<String[]> bjk_finalList = new ArrayList<String[]>();
	private String bjk_firstElement, bjk_lastElement;
	
	public SetOrganizer(String[] firstSet) {
		this.bjk_finalList = new ArrayList<String[]>();
		
		// These are the elements that will determine we are done with swapping once they reach their original point
		this.bjk_firstElement = firstSet[0];
		this.bjk_lastElement = firstSet[(firstSet.length-1)];
		
		this.bjk_finalList.add(firstSet);
		swap((firstSet.length-1), firstSet);
	}
	
	public ArrayList<String[]> getFinalList() {
		return this.bjk_finalList;
	}
	
	private void swap(int position, String[] lastList) {
		ArrayList<String> builder = new ArrayList<String>();
		
		for(int iterator = 0; iterator < lastList.length; iterator++) {
			if((iterator+1) == position) {
				builder.add(lastList[position]);
			}
			else if((position == iterator) && (position != 0)) {
				builder.add(lastList[position-1]);
			}
			else {
				builder.add(lastList[iterator]);
			}
		}
		
		
		if(builder.get(0).toString() == this.bjk_firstElement && builder.get(builder.size()-1).toString() == this.bjk_lastElement) {
			// We stop here
		}
		else {
			int newPosition = ((position - 1) > 0 ? (position-1) : (builder.size()-1));
			
			// Add this new array to our master list
			String[] finalVal = new String[builder.size()];
			finalVal = builder.toArray(finalVal);
			this.bjk_finalList.add(finalVal);
			
			swap(newPosition, finalVal);
		}
	}
}