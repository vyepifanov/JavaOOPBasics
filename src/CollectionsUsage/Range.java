package CollectionsUsage;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer>, Iterator<Integer> {
	private int start;
	private int end;
	private int pos;

	public Range(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	@Override
	public Iterator<Integer> iterator() {
		this.pos = start;
		return this;
	}

	@Override
	public boolean hasNext() {
		return pos <= end;
	}

	@Override
	public Integer next() {
		if (!hasNext()) throw new NoSuchElementException();
		return pos++;
	}
}
