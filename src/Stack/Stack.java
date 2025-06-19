package Stack;

public class Stack {
	private int capacity;
	private char[] stack;
	private int head;

	public Stack() {}

	public Stack(int capacity) {
		this.capacity = capacity;
		stack = new char[capacity];
		head = -1;
	}

	void push(char c) throws StackException {
		try {
			stack[++head] = c;
		} catch (ArrayIndexOutOfBoundsException exc) {
			head--;
			throw new StackException("Стек заполнен!");
		}
	}

	char pop() throws StackException {
		try {
			return stack[head--];
		} catch (ArrayIndexOutOfBoundsException exc) {
			throw new StackException("Попытка извлечь из пустого стека!");
		}
	}

	void print() {
		if (head < 0) {
			System.out.println("Стек пуст");
			return;
		}

		for (int i = head; i >= 0; i--) {
			System.out.printf("%c ", stack[i]);
		}
		System.out.println();
	}

	void clear() {
		head = -1;
	}
}
