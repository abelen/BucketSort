package sorting;

import java.util.ArrayList;

/* InsertionSort.java*/

public class InsertionSort {
	
	public static int[] insertionSort(int[] arr) {
		
		/* sanity check to see if the arr is not empty or just
		 * has one element */
		if (arr.length == 0 || arr.length == 1) {
			return arr;
		} else {
			int i;
			int key;
			int j;
			for (i = 1; i < arr.length; i++) {
				key = arr[i];
				// now we go through the array and move the element up to
				// until it's proper place
				j = i - 1;
				while (j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = key;
			}
		}
		return arr;
	}
	
	/* Overloaded insertionSort method so it can work with ArrayLists */
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
		
		/* sanity check to see if the arr is not empty or just
		 * has one element */
		if (arr.size() == 0 || arr.size() == 1) {
			return arr;
		} else {
			int i;
			int key;
			int j;
			int smallValue;
			int bigValue;
			for (i = 1; i < arr.size(); i++) {
				key = arr.get(i);
				// now we go through the array and move the element up to
				// until it's proper place
				j = i - 1;
				while (j >= 0 && arr.get(j) > key) {
					smallValue = arr.get(j + 1);
					bigValue = arr.get(j);
					arr.remove(j);
					arr.remove(j);
					arr.add(j, smallValue);
					arr.add(j + 1, bigValue);
					j = j - 1;
				}
				
			}
		}
		return arr;
	}
	
	

}
