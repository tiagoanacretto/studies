package algorithms.linearsearch;

public class App {

	public static void main(String[] args) {
		
	}
	
	public static int linearSearch(int[] a, int x) {
		int answer = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
