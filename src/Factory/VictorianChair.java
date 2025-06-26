package Factory;

public class VictorianChair implements Chair{
	private final String TYPE = "Кресло";
	private final String STYLE = "викторианском стиле";
	private final int COST = 80;

	@Override
	public String description() {
		return String.format("%s в %s", TYPE, STYLE);
	}

	@Override
	public int getCost() {
		return COST;
	}
}
