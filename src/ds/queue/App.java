package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(1000);
		myQueue.insert(14);
		myQueue.view();
		System.out.println(String.format("Removed: %d", myQueue.remove()));
		myQueue.view();
		myQueue.insert(12);
		myQueue.insert(44);
		//myQueue.insert(33);
		//myQueue.insert(8);
		myQueue.view();
		
		System.out.println(String.format("Removed: %d", myQueue.remove()));
		myQueue.view();
		myQueue.insert(90);
		myQueue.view();
	}

}
