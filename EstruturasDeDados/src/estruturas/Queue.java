package estruturas;

public class Queue {

	int[] queue;
	int capacity;
	int tail;
	
	public Queue(int capacity) {
		this.queue = new int[capacity];
		this.capacity = capacity;
		this.tail = -1;
	}
	
	public void add(int n) {
		if (isFull()) throw new RuntimeException();
		
		this.tail++;
		this.queue[tail] = n;
	}
	
	public int remove() {
		int value = this.head();
		shiftLeft();
		this.tail--;
		
		return value;
	}
	
	public int head() {
		if (isEmpty()) throw new RuntimeException();
		
		return this.queue[0];
	}
	
	public boolean isEmpty() {
		return this.tail == -1;
	}
	
	public boolean isFull() {
		return this.tail == (this.capacity - 1);
	}
	
	private void shiftLeft() {
		int i = tail;
		
		while (i > 0) {
			int aux = this.queue[i];
			this.queue[i] = this.queue[i-1];
			this.queue[i-1] = aux;
			i--;
		}
	}
	
	public static void main(String[] args) {
		
		Queue q = new Queue(10);
		
		assert q.isEmpty();
		q.add(2);
		q.add(5);
		q.add(7);
		q.remove();
		assert q.head() == 2;
		assert q.remove() == 2;
		assert q.head() == 5;
		
		q.add(3);
		q.add(1);
		q.add(10);
		q.add(9);
		q.add(4);
		q.add(6);
		
		assert q.remove() == 5;
		q.remove();
		assert q.head() == 7;
		
		q.add(2);
		assert !q.isFull();
		
		q.add(14);
		q.add(29);
		assert q.isFull();
	}
}
