package Factory;

public class ModernCoffeeTable implements CoffeeTable{
	private final String TYPE = "Столик";
	private final String STYLE = "Модерн";
	private final int COST = 10;

	@Override
	public String description() {
		return String.format("%s в стиле %s", TYPE, STYLE);
	}

	@Override
	public int getCost() {
		return COST;
	}
}
