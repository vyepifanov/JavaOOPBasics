package Factory;

public class VictorianCoffeeTable implements CoffeeTable{
	private final String TYPE = "Столик";
	private final String STYLE = "викторианском стиле";
	private final int COST = 70;

	@Override
	public String description() {
		return String.format("%s в %s", TYPE, STYLE);
	}

	@Override
	public int getCost() {
		return COST;
	}
}
