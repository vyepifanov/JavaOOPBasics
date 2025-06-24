package CollectionsUsage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Garage implements Iterable<Car>, Iterator<Car> {
	private int capacity;
	private Car[] arr;
	private boolean[] isFree;
	private int pos;

	public Garage(int capacity) {
		this.capacity = capacity;
		this.arr = new Car[capacity];
		this.isFree = new boolean[capacity];

		Arrays.fill(this.isFree, true);
	}

	public int getCapacity() {
		return capacity;
	}

	public void putCar(Car unit, int i) throws ErrorBoxException{
		if (!isFree[i - 1]) throw new ErrorBoxException();
		arr[i - 1] = unit;
		isFree[i - 1] = false;
	}

	public Car getCar(int i) throws ErrorBoxException {
		if (isFree[i - 1]) throw new ErrorBoxException();
		isFree[i - 1] = true;
		return arr[i - 1];
	}

	public boolean isFree(int number) {
		return (number > 0 && number <= capacity && isFree[number - 1]);
	}

	public int getFreeBoxnumber() {
		for (int i = capacity; i > 0; i--) {
			if (isFree(i)) return i;
		}
		return -1;
	}

	@Override
	public Iterator<Car> iterator() {
		this.pos = capacity;
		return this;
	}

	@Override
	public boolean hasNext() {
		return pos > 0;
	}

	@Override
	public Car next() {
		if (!hasNext()) throw new NoSuchElementException();
		if (isFree(pos)) {
			pos--;
			return null;
		} else{
			pos--;
			return arr[pos];
		}
	}
}
