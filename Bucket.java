package sorting;

import java.util.ArrayList;

public class Bucket {
	
	private int lowValue;
	private int highValue;
	private ArrayList<Integer> values;
	
	public Bucket(int lowValue, int highValue) {
		this.setLowValue(lowValue);
		this.setHighValue(highValue);
		values = new ArrayList<Integer>();
	}

	public int getLowValue() {
		return lowValue;
	}

	public void setLowValue(int lowValue) {
		this.lowValue = lowValue;
	}

	public int getHighValue() {
		return highValue;
	}

	public void setHighValue(int highValue) {
		this.highValue = highValue;
	}

	public ArrayList<Integer> getValues() {
		return values;
	}
	
	public void setValues(ArrayList<Integer> values) {
		this.values = values;
	}


	
	
}

