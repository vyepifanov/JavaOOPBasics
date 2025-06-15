public class Accountant extends Employee{
	private char gruppa;

	public Accountant(char gruppa) {
		this.gruppa = gruppa;
	}

	public Accountant(String surname, String sex, int age, int salary, char gruppa) {
		super(surname, sex, age, salary);
		this.gruppa = gruppa;
	}

	public char getGruppa() {
		return gruppa;
	}

	public void setGruppa(char gruppa) {
		this.gruppa = gruppa;
	}

	@Override
	void show() {
		System.out.printf("%s;%s;%d;%d;%s%n",
				super.getSurname(), super.getSex(), super.getAge(), super.getSalary(), gruppa);
	}
}
