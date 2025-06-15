public abstract class Learner {
	private String name;
	private int mark1;
	private int mark2;

	public Learner() {}

	public Learner(String name, int mark1, int mark2) {
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int grade1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public double averageGrade() {
		return (mark1 + mark2) / 2.0;
	}

	public abstract int holidays();

	@Override
	public String toString() {
		return name + ';' + mark1 + ";" + mark2;
	}
}
