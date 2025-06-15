public class Thing {
	private String name;
	private Material mat;
	private double volume;

	public Thing() {
	}

	public Thing(String name, Material mat, double volume) {
		this.name = name;
		this.mat = mat;
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Material getMat() {
		return mat;
	}

	public void setMat(Material mat) {
		this.mat = mat;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getMass() {
		return this.mat.getPl() * this.volume;
	}

	void show() {
		System.out.printf("%s;%s;%d;%.2f;%.1f%n",
				this.name, this.mat.getName(), this.mat.getPl(), this.volume, this.getMass());
	}
}
