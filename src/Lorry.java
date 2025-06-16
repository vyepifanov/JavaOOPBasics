public class Lorry implements Transport {
	private double maxWeight;
	private double totalWeight;

	public Lorry() {
	}

	public Lorry(double maxWeight) {
		this.maxWeight = maxWeight;
		this.totalWeight = 0;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Override
	public double getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(double totalWeight) {
		this.totalWeight = totalWeight;
	}

	@Override
	public String toString() {
		return "Lorry{" +
				"maxWeight=" + maxWeight +
				", totalWeight=" + totalWeight +
				'}';
	}

	@Override
	public boolean canCarry(double weight) {
		return weight <= maxWeight;
	}

	@Override
	public void add(double weight) {
		totalWeight += weight;
	}
}
