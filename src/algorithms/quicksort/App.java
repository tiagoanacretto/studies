package algorithms.quicksort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] inputArray = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};
		quickSort(inputArray);
		System.out.println(Arrays.toString(inputArray));
	}
	
	private static void quickSort(int[] inputArray) {
		quickSort(inputArray, 0, inputArray.length-1);
	}
	
	private static void quickSort(int[] inputArray, int p, int r) {
		if (p < r) {
			int q = partition(inputArray, p, r);
			quickSort(inputArray, p, q-1);
			quickSort(inputArray, q+1, r);
		}
	}
	
	private static int partition(int[] inputArray, int p, int r) {
		int i = p - 1;
		int x = inputArray[r];
		for (int j = p; j < r; j++) {
			if (inputArray[j] <= x) {
				i++;
				int temp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j] = temp;
			}
		}
		int temp = inputArray[i+1];
		inputArray[i+1] = inputArray[r];
		inputArray[r] = temp;
		return i+1;
	}
}
