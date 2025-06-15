public class Employee {
	private String surname;
	private String sex;
	private int age;
	private int salary;

	public Employee() {
	}

	public Employee(String surname, String sex, int age, int salary) {
		this.surname = surname;
		this.sex = sex;
		this.age = age;
		this.salary = salary;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	boolean isPensioner() {
		return (sex.equals("male") && age >= 63) || (sex.equals("female") && age >= 58);
	}

	void changeSalary(double koef) {
		salary = (int)(salary * koef);
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%d;%d%n", surname, sex, age, salary);
	}

	void show() {
		System.out.printf("%s;%s;%d;%d%n", surname, sex, age, salary);
	}
}
