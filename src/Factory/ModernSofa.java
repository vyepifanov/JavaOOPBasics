package Factory;

public class ModernSofa implements Sofa{
	private final String TYPE = "Диван";
	private final String STYLE = "Модерн";
	private final int COST = 80;

	@Override
	public String description() {
		return String.format("%s в стиле %s", TYPE, STYLE);
	}

	@Override
	public int getCost() {
		return COST;
	}
}
