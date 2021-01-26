package Stack;

public class Dstack {

	private int stack[];
	int top;

	public Dstack(int lengde) {
		stack = new int[lengde];
		top = 0;
	}

	public void push(int data) {

		if (top >= stack.length) {

			expand();

		}
		stack[top] = data;
		top++;

	}

	private void expand() {
		int newStack[] = new int[stack.length * 2];
		for (int i = 0; i < stack.length; i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
	}

	public int pop() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("Stack is Empty");

		} else {

			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();

		}
		return data;
	}

	private void shrink() {
		if (top <= stack.length * 1 / 2) {
			int newStack[] = new int[stack.length / 2];
			for (int i = 0; i < newStack.length; i++) {
				newStack[i] = stack[i];
			}
			stack = newStack;
		}

	}

	public int peek() {
		int data;

		data = stack[top - 1];

		return data;

	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public void show() {
		for (int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
