import java.util.Calendar;

public class Car {
	private String brand;
	private String name;
	private double vol;
	private int year;

	public static int yearNow;

	static {
		Calendar cal = Calendar.getInstance();
		yearNow = cal.get(Calendar.YEAR);
	}

	public Car() {}

	public Car(String brand, String name, double vol, int year) {
		this.brand = brand;
		this.name = name;
		this.vol = vol;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVol() {
		return vol;
	}

	public void setVol(double vol) {
		this.vol = vol;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static int getYearNow() {
		return yearNow;
	}

	public int getLife() {
		return yearNow - this.year;
	}

	@Override
	public String toString() {
		return String.format(
				"Car{brand='%s', owner='%s', volume=%.1f, yearOfMade=%d}",
				brand, name, vol, year);
	}
}
