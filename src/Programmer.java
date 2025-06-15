public class Programmer extends Employee {
	private String status;
	private String specialization;

	public Programmer(String status, String specialization) {
		this.status = status;
		this.specialization = specialization;
	}

	public Programmer(String surname, String sex, int age, int salary, String status, String specialization) {
		super(surname, sex, age, salary);
		this.status = status;
		this.specialization = specialization;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return super.toString() + ';' + status;
	}

	@Override
	void show() {
		System.out.printf("%s;%s;%d;%d;%s%n",
				super.getSurname(), super.getSex(), super.getAge(), super.getSalary(), status);
	}
}
