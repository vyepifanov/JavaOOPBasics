package CollectionsUsage;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseArray implements Iterable<Integer>, Iterator<Integer> {
	private int[] arr;
	private int pos;

	public ReverseArray(int[] arr) {
		this.arr = arr;
	}

	@Override
	public Iterator<Integer> iterator() {
		this.pos = arr.length - 1;
		return this;
	}

	@Override
	public boolean hasNext() {
		return pos >= 0;
	}

	@Override
	public Integer next() {
		if (!hasNext()) throw new NoSuchElementException();
		return arr[pos--];
	}
}
