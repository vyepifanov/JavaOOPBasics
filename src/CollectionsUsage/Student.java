package CollectionsUsage;

public class Student {
	private String name;
	private double avgMark;
	private int age;

	public Student() {}

	public Student(String name, double avgMark, int age) {
		this.name = name;
		this.avgMark = avgMark;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(int avgMark) {
		this.avgMark = avgMark;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ';' + avgMark + ";" + age;
	}
}
