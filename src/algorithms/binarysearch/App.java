package algorithms.binarysearch;

public class App {

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {10, 15, 20, 22, 30, 40, 50},  20));
		
		System.out.println(binarySearch(new int[] {10, 20, 25, 30, 33, 36, 40, 50},  40));
		
		System.out.println(binarySearch(new int[] {10, 20, 25, 30, 33, 36, 40, 50},  10));
		
		System.out.println(binarySearch(new int[] {10, 20, 25, 30, 33, 36, 40, 50},  11));
	}

	public static int binarySearch(int[] a, int x) {
		int p = 0;
		int r = a.length - 1;
		
		while (p <= r) {
			int q = (p + r) / 2;
			if (a[q] == x) {
				return q;
			} else if (a[q] > x) {
				r = q - 1;
			} else {
				p = q + 1;
			}
		}
		
		return -1;
	}
}
