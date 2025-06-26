package Factory;

public class VictorianSofa implements Sofa{
	private final String TYPE = "Диван";
	private final String STYLE = "викторианском стиле";
	private final int COST = 110;

	@Override
	public String description() {
		return String.format("%s в %s", TYPE, STYLE);
	}

	@Override
	public int getCost() {
		return COST;
	}
}
