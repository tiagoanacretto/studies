package algorithms.mergesort;

public class MergeSort {

	public void sort(int[] inputArray) {
		this.sort(inputArray, 0, inputArray.length-1);
	}
	
	public void sort(int[] inputArray, int start, int end) {
		if (end <= start) {
			return;
		}
		
		int mid = (start + end) / 2;
		sort(inputArray, start, mid);
		sort(inputArray, mid+1, end);
		merge(inputArray, start, mid, end);
	}
	
	public void merge(int[] inputArray, int start, int mid, int end) {
		int tempArray[] = new int[end - start + 1];
		
		int leftSlot = start;
		int rightSlot = mid + 1;
		int k = 0;
		
		while (leftSlot <= mid && rightSlot <= end) {
			if (inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
			}
			k++;
		}
		
		if (leftSlot <= mid) {
			while (leftSlot <= mid) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
				k++;
			}
		} else if (rightSlot <= end) {
			while (rightSlot <= end) {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
				k++;
			}
		}
		
		for (int i = 0; i < tempArray.length ; i++) {
			inputArray[start+i] = tempArray[i];
		}
 	}
}
