package Factory;

public class ArtDecoFurnitureFactory implements FurnitureFactory{
	public ArtDecoFurnitureFactory() {
	}

	@Override
	public Chair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ArtDecoCoffeeTable();
	}
}
