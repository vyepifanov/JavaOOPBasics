public class Rectangle implements IShape {
	private double a;
	private double b;

	public Rectangle() {}

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double computeSquare() {
		return a * b;
	}
}
