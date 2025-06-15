import java.util.Objects;

public class Commodity {
	private String name;
	private int price;

	public Commodity() {
	}

	public Commodity(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Commodity commodity)) return false;
		return price == commodity.price && Objects.equals(name, commodity.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public String toString() {
		return name + ';' + price;
	}

	public void show() {
		System.out.printf("Наименование товара: %s%n", this.name);
		System.out.printf("Цена товара: %d%n", this.price);
	}
}
