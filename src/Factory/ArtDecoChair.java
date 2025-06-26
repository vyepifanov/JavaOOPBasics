package Factory;

public class ArtDecoChair implements Chair{
	private final String TYPE = "Кресло";
	private final String STYLE = "Арт-деко";
	private final int COST = 50;

	@Override
	public String description() {
		return String.format("%s в стиле %s", TYPE, STYLE);
	}

	@Override
	public int getCost() {
		return COST;
	}
}
