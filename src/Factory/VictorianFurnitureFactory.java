package Factory;

public class VictorianFurnitureFactory implements FurnitureFactory{
	public VictorianFurnitureFactory() {
	}

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new VictorianCoffeeTable();
	}
}
