package CollectionsUsage;

public class Car {
	private String brand;
	private double vol;

	public Car(String brand, double vol) {
		this.brand = brand;
		this.vol = vol;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getVol() {
		return vol;
	}

	public void setVol(double vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return brand + ';' + vol;
	}
}
