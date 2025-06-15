import java.util.Objects;

public class Purchase {
	private Commodity com;
	private int count;

	public Purchase() {}

	public Purchase(Commodity com, int count) {
		this.com = com;
		this.count = count;
	}

	public Commodity getCom() {
		return com;
	}

	public void setCom(Commodity com) {
		this.com = com;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return com.toString() + ';' + count + ';' + this.getCost();
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Purchase purchase)) return false;
		return Objects.equals(com, purchase.com);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(com);
	}

	public int getCost() {
		return this.count * this.com.getPrice();
	}

	void show() {
		this.com.show();
		System.out.printf("Количество: %d%n", this.count);
		System.out.printf("Стоимость покупки: %d%n", this.getCost());
	}
}
