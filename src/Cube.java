public class Cube implements IShape {
	private double a;

	public Cube() {}

	public Cube(double a) {
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double computeSquare() {
		return 6 * Math.pow(a, 2);
	}
}
