package CollectionsUsage;

import java.util.Objects;

public class Purchase {
	private String name;
	private int price;
	private int quantity;

	public Purchase(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getValue() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return name + ";" + price + ";" + quantity;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Purchase purchase = (Purchase) o;
		return price == purchase.price && name.equals(purchase.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
}
