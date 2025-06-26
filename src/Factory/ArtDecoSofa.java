package Factory;

public class ArtDecoSofa implements Sofa{
	private final String TYPE = "Диван";
	private final String STYLE = "Арт-деко";
	private final int COST = 90;

	@Override
	public String description() {
		return String.format("%s в стиле %s", TYPE, STYLE);
	}

	@Override
	public int getCost() {
		return COST;
	}
}
