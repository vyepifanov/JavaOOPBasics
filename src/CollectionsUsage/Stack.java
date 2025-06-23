package CollectionsUsage;

public class Stack<E> {
	private int capacity;
	private E[] stack;
	private int head;

	public Stack() {}

	public Stack(int capacity) {
		this.capacity = capacity;
		stack = (E[]) new Object[capacity];
		head = -1;
	}

	void push(E elem) throws StackException {
		try {
			stack[++head] = elem;
		} catch (ArrayIndexOutOfBoundsException exc) {
			head--;
			throw new StackException("Стек заполнен!");
		}
	}

	E pop() throws StackException {
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
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	void clear() {
		head = -1;
	}
}
