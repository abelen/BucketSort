package sorting;

/* BucketSort.java */
/* Note: This current implementation may not be the most efficient since it uses 
 * an ArrayList data structure within each Bucket.
 * More unit tests to be written so it can be tested.
 */

public class BucketSort {
	
	public static int[] bucketSort(int[] arr) {
		
		/* find check to see if the arr is empty or only one element */
		if (arr.length == 0 || arr.length == 1) {
			return arr;
		} else {
		
			/* first find the max value */
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			Bucket[] buckets = new Bucket[10];
			int range;
			final int numBuckets = 10;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			/* now we can create 10 buckets of equal size. */
			range = (max - min) + 1;
			int sizeOfBuckets = (int) Math.ceil(range / 10);
			System.out.println(sizeOfBuckets);
			int currVal = min;
			int arrCurrPos = 0;
			
			for (int i = 0; i < numBuckets; i++) {
				buckets[i] = new Bucket(currVal, currVal + (sizeOfBuckets) );
				buckets[i].setLowValue(currVal);
				buckets[i].setHighValue(currVal + (sizeOfBuckets - 1));
				currVal += sizeOfBuckets + 1;
			}
			
			for (int i = 0; i < arr.length; i++) {
				
				/* go thru each bucket and then put in the array value into the correct one */
				for (int j = 0; j < numBuckets; j++) {
					
					if (arr[i] >= buckets[j].getLowValue() && arr[i] <= buckets[j].getHighValue()) {
						System.out.println("bla");
						buckets[j].getValues().add(arr[i]);
						break;
					}
				}
			}
			/* after inserting all values into the bucket, then run insertion sort onto the 
			 * buckets.
			 */
			for (int j = 0; j < numBuckets; j++) {
				buckets[j].setValues(InsertionSort.insertionSort(buckets[j].getValues()));
			}
			
			/* now to copy the elements from the buckets over to the array */
			
			for (int i = 0; i < numBuckets; i++) {
				for (int j = 0; j < buckets[i].getValues().size(); j++) {
					arr[arrCurrPos] = buckets[i].getValues().get(j);
					arrCurrPos++;
				}
			}
			
			return arr;
		
		}
	}

}
