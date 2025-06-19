package ClassUsage;

public class Dog {
	private String name;
	private String breed;
	private Collar collar;

	public Dog(String name, String breed, String color, double size) {
		this.name = name;
		this.breed = breed;
		this.collar = new Collar(color, size);
	}

	public double getSize() {
		return collar.getSize();
	}

	public double compareTo(Dog two) {
		return (this.getSize() - two.getSize());
	}

	private class Collar {
		private String color;
		private double size;

		public Collar() {}

		public Collar(String color, double size) {
			this.color = color;
			this.size = size;
		}

		public double getSize() {
			return size;
		}
	}
}
