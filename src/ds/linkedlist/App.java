package ds.linkedlist;

public class App {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;

		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.nextNode = nodeB;
		nodeB.nextNode = nodeC;
		nodeC.nextNode = nodeD;
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
		System.out.println(listLength(nodeC));
		System.out.println(listLength(nodeD));
	}
	
	public static int listLength(Node node) {
		int length = 0;
		Node currentNode = node;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.nextNode;
		}
		return length;
	}
	
	public static int listLengthMine(Node node) {
		int count = 1;
		if (node.nextNode != null) {
			count += listLength(node.nextNode);
		}
		return count;
	}
}
