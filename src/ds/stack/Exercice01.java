package ds.stack;

public class Exercice01 {

	public static void main(String[] args) {
		String valRev = reverseString("OGAIT");
		System.out.println(valRev);
	}

	public static String reverseString(String value) {
		Stack stack = new Stack(value.length());
		for (int i = 0; i < value.length(); i++) {
			stack.push(value.charAt(i));
		}
		StringBuilder reverse = new StringBuilder();
		while(!stack.isEmpty()) {
			char ch = stack.pop();
			reverse.append(ch);
		}
		return reverse.toString();
	}
}
