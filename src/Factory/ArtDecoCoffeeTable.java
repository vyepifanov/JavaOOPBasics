package Factory;

public class ArtDecoCoffeeTable implements CoffeeTable{
	private final String TYPE = "Столик";
	private final String STYLE = "Арт-деко";
	private final int COST = 65;

	@Override
	public String description() {
		return String.format("%s в стиле %s", TYPE, STYLE);
	}

	@Override
	public int getCost() {
		return COST;
	}
}
