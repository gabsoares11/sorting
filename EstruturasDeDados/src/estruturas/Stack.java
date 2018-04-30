package estruturas;

import java.util.Arrays;

public class Stack<T> {
	
	int[] stack;
	int capacity;
	int top;
	
	public Stack(int capacity) {
		this.stack = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	public void push(int n) {
		if (isFull()) throw new RuntimeException();
		
		this.top++;
		this.stack[top] = n;
		
	}
	
	public int pop() {
		if (isEmpty()) throw new RuntimeException();
		
		int value = this.stack[top];
		this.top--;
		
		return value;
	}
	
	public int peek() {
		if (isEmpty()) throw new RuntimeException();
		
		return stack[top];
	}
	
	public int size() {
		return this.top + 1;
	}
	
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	public boolean isFull() {
		return this.top == (this.capacity - 1);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(stack);
	}	
	
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		assert stack.isEmpty();
		assert !stack.isFull();
		assert stack.size() == 0;
		
		stack.push(10);
		assert stack.peek() == 10;
		assert stack.size() == 1;
		assert !stack.isEmpty();

		stack.push(5);
		assert stack.size() == 2;
		
		assert stack.pop() == 5;
		
		stack.push(7);
		assert stack.peek() == 7;
		stack.pop();
		
		assert !stack.isEmpty();
		
		stack.push(8);
		stack.push(6);
		stack.push(4);
		assert stack.isFull();

		System.out.println(stack.toString());
		
	}
	
}