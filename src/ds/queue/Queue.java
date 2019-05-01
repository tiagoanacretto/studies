package ds.queue;

public class Queue {

	private int maxSize;       // initializes the set number of slots
	private long[] queueArray; // slots to main the data
	private int front;         // this will be the index position for the element in the front
	private int rear;          // this is also going to be the index position for the element at the back of the line
	private int nItems;        // counter to maintain the number of items in our queue
	
	public Queue(int size) { 
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0; // index position of the first slot of the array
		this.rear = -1; // there is no items in the array yet to be considered as the last item
		this.nItems = 0; // we don't have elements in the array yet
	}
	
	public void insert(long j) {
		if (rear == maxSize - 1) { // Circular Queue - this overwrite the first position when the array is full
			rear = -1;
		}
		rear++;
		queueArray[rear] = j;
		nItems++;
	}
	
	public long remove() { // remove item from the front of the queue
		long temp = queueArray[front];
		front++;
		if (front == maxSize) {
			front = 0; // we can set front back to the 0th index so that we can utilize the entire array again
		}
		nItems--;
		return temp;
	}
	
	public long peekFront() { // just to get the first element
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	public void view() {
		System.out.print("[");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i]+ " ");
		}
		System.out.print("]\n");
	}
}
