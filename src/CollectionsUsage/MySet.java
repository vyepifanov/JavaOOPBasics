package CollectionsUsage;

import java.util.Arrays;

public class MySet<E> {
	private E[] elements;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;

	public MySet() {
		this(DEFAULT_CAPACITY);
	}

	public MySet(int initialCapacity) {
		this.elements = (E[]) new Object[initialCapacity];
		this.size = 0;
	}

	public void add(E element) {
		if (contains(element)) {
			return;
		}
		ensureCapacity();
		elements[size++] = element;
	}

	private boolean contains(E element) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(element)) {
				return true;
			}
		}
		return false;
	}

	private void ensureCapacity() {
		if (size == elements.length) {
			int newCapacity = (int) (elements.length * 1.5) + 1;
			elements = Arrays.copyOf(elements, newCapacity);
		}
	}

	public void print() {
		if (size == 0) {
			System.out.println("Пустое множество");
			return;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(elements[i]);
			if (i < size - 1) {
				System.out.println();
			}
		}
	}
}
