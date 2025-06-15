public class Truck  extends Car {
	private double capacity;

	public Truck(double capacity) {
		this.capacity = capacity;
	}

	public Truck(String mark, String name, double vol, int year, double capacity) {
		super(mark, name, vol, year);
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public boolean ifCanCarry(double weight) {
		return capacity >= weight;
	}

	@Override
	public String toString() {
		return String.format("Truck{brand='%s', owner='%s', volume=%.1f, yearOfMade=%d, capacity=",
				super.getBrand(), super.getName(), super.getVol(), super.getYear()) +
				getCapacity() + '}';
	}
}
