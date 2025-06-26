package Factory;

public class ModernChair implements Chair{
	private final String TYPE = "Кресло";
	private final String STYLE = "Модерн";
	private final int COST = 20;

	@Override
	public String description() {
		return String.format("%s в стиле %s", TYPE, STYLE);
	}

	@Override
	public int getCost() {
		return COST;
	}
}
